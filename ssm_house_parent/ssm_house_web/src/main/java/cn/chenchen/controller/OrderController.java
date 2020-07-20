package cn.chenchen.controller;

import cn.chenchen.domain.Member;
import cn.chenchen.domain.Order;
import cn.chenchen.service.OrderService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    //生成一个订单
    @RequestMapping("/addOrder")
    public String addOrder(Order order){
        order.setOrderTime(new Date());
        orderService.addOrder(order);
        return "message";
    }

    //根据用户信息查询订单
    @RequestMapping("/findByMid")
    public ModelAndView findByMid(int mid, @RequestParam(name = "page",required = true,defaultValue = "1" ) int page,@RequestParam(name = "size",required = true,defaultValue = "5" ) int size){
        ModelAndView mv = new ModelAndView();
        List<Order> orderList =  orderService.findByMid(mid,page,size);
        PageInfo pageInfo = new PageInfo(orderList);
        //传递参数 mid
        Member m1 = new Member();
        m1.setMid(mid);
        mv.addObject("pageInfo",pageInfo);
        mv.addObject("m1",m1);
        mv.setViewName("dingdan");
        return mv;
    }

    //分页查询全部订单
    @RequestMapping("/findAllByPage")
    public ModelAndView findAllByPage( @RequestParam(name = "page",required = true,defaultValue = "1" ) int page,@RequestParam(name = "size",required = true,defaultValue = "5" ) int size){
        ModelAndView mv = new ModelAndView();
        List<Order> orderList =  orderService.findAll(page,size);
        PageInfo pageInfo = new PageInfo(orderList);
        mv.addObject("pageInfo",pageInfo);
        mv.setViewName("admin_find_orders");
        return mv;
    }

    //分页查询全部订单
    @RequestMapping("/findAllByPage2")
    public ModelAndView findAllByPage2( @RequestParam(name = "page",required = true,defaultValue = "1" ) int page,@RequestParam(name = "size",required = true,defaultValue = "5" ) int size){
        ModelAndView mv = new ModelAndView();
        List<Order> orderList =  orderService.findAll(page,size);
        PageInfo pageInfo = new PageInfo(orderList);
        mv.addObject("pageInfo",pageInfo);
        mv.setViewName("cashier_affirm_reserve");
        return mv;
    }

    //分页查询全部已经预定的订单
    @RequestMapping("/findReserveByPage")
    public ModelAndView findReserveByPage( @RequestParam(name = "page",required = true,defaultValue = "1" ) int page,@RequestParam(name = "size",required = true,defaultValue = "5" ) int size){
        ModelAndView mv = new ModelAndView();
        List<Order> orderList =  orderService.findReserveByPage(page,size);
        PageInfo pageInfo = new PageInfo(orderList);
        mv.addObject("pageInfo",pageInfo);
        mv.setViewName("cashier_CheckIn_reserve");
        return mv;
    }

    //根据id修改订单状态为已预定
    @RequestMapping("/updateToReserveById")
    public String updateToReserveById(int id){
        orderService.updateToReserveById(id);
        return "redirect:findAllByPage2";
    }

    //办理入住（订单状态变为已完成，房间状态变为住人）
    @RequestMapping("/updateToCompleteById")
    public String updateToCompleteById(int id){
        orderService.updateToCompleteById(id);
        return "redirect:findAllByPage2";
    }

    //取消预定（订单状态变为已取消，房间状态变为空房）
    @RequestMapping("/updateToCancelById")
    public String updateToCancelById(int id){
        orderService.updateToCancelById(id);
        return "redirect:findAllByPage2";
    }
}
