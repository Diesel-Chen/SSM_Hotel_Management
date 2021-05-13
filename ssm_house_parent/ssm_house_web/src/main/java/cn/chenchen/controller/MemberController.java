package cn.chenchen.controller;

import cn.chenchen.dao.MemberDao;
import cn.chenchen.domain.Member;
import cn.chenchen.domain.Order;
import cn.chenchen.domain.ResultInfo;
import cn.chenchen.service.HouseService;
import cn.chenchen.service.MemberService;
import cn.chenchen.service.OrderService;
import cn.chenchen.utils.HanZiToPinYinUtils;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/member")
public class MemberController {

    @Autowired
    private MemberService memberService;

    @Autowired
    private MemberDao memberDao;

    @Autowired
    private HouseService houseService;

    @Autowired
    private OrderService orderService;

    //登录
    @RequestMapping("/denglu")
    public ModelAndView login(Member member, HttpServletRequest request){
        ModelAndView mv = new ModelAndView();
        Member member1 = memberService.login(member);
        if(member1!=null){
            mv.addObject(member1);
            request.getSession().setAttribute("member",member1);
            mv.setViewName("main");
        }else{
            ResultInfo resultInfo = new ResultInfo();
            resultInfo.setErrorMsg("用户名或者密码输入有误！");
            mv.addObject("resultInfo",resultInfo);
            mv.setViewName("login");
        }
        return mv;
    }

    //注册
    @RequestMapping("/register")
    public String register(Member member){
        memberService.register(member);
        return "login";
    }

    //注销
    @RequestMapping("/logout")
    public String logout(HttpServletRequest request){
        request.getSession().invalidate();
        return "login";
    }

    //修改信息
    @RequestMapping("/update")
    public String update(Member member,HttpServletRequest request){
        memberService.update(member);
        request.getSession().invalidate();
        Member member1 = memberDao.findById(member.getMid());
        request.getSession().setAttribute("member",member1);
        return "redirect:findAllByPage";
    }

    //修改密码
    @RequestMapping("/updatePassword")
    public String updatePassword(Member member,HttpServletRequest request){
        memberService.updatePassword(member);
        request.getSession().invalidate();
        return "login";
    }

    //查询全部会员(分页查询)
    @RequestMapping("/findAllByPage")
    public ModelAndView findAllByPage(@RequestParam(name = "page" , required = true,defaultValue = "1") int page,@RequestParam(name = "size",required = true,defaultValue = "5") int size){
        ModelAndView mv = new ModelAndView();
        List<Member> memberList =  memberService.findAllByPage(page,size);
        PageInfo pageInfo = new PageInfo(memberList);
        mv.addObject("pageInfo",pageInfo);
        mv.setViewName("admin_find_member");
        return mv;
    }

    //管理员添加会员
    @RequestMapping("/addMember")
    public String addMember(Member member){
        memberService.register(member);
        return "redirect:findAllByPage";
    }

    //办理入住
    @RequestMapping("/checkIn")
    public String checkIn(Member member, int hid, Order order){

        //1.增加一个临时会员。
        member.setUserName(HanZiToPinYinUtils.ToPinyin(member.getRealName()));
        member.setPassWord(HanZiToPinYinUtils.ToPinyin(member.getRealName()));
        //插入显示刚插入的id
        int mid = memberService.register2(member);
        //2.把房间状态改为入住
        houseService.updateToPeople(hid);
        //3.添加一条订单-状态为已完成
        order.setOrderTime(new Date());
        order.setHouseId(hid);
        order.setMemberId(mid);
        orderService.addOrder2(order);
        return "cashier_CheckIn";

    }

    //删除会员
    @RequestMapping("/delete")
    public String deleteById(@RequestParam(name = "id",required = true) int id){
        memberService.delete(id);
        return "redirect:findAllByPage";
    }

    //查询会员详情
    @RequestMapping("/findById")
    public ModelAndView findById(@RequestParam(name = "id",required = true) int id){
        ModelAndView mv = new ModelAndView();
        Member member= memberService.FindById(id);
        mv.addObject("member",member);
        mv.setViewName("admin_edit_member");
        return mv;
    }



}
