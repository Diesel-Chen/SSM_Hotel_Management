package cn.chenchen.controller;

import cn.chenchen.domain.House;
import cn.chenchen.domain.HouseCount;
import cn.chenchen.domain.SelectDate;
import cn.chenchen.service.HouseService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.jws.WebParam;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/house")
public class HouseController {

    @Autowired
    private HouseService houseService;

    //查询全部空房按照房型
    @RequestMapping("/findAllVacant")
    public ModelAndView findAllVacant(SelectDate selectDate, HttpServletRequest request){
        ModelAndView mv = new ModelAndView();
        request.getSession().setAttribute("selectDate",selectDate);
        List<House> houseList = houseService.findAllVacant();
        mv.addObject("houseList",houseList);
        mv.setViewName("house_list");
        return mv;
    }

    //根据房型查询全部空闲房间
    @RequestMapping("/findByName")
    public ModelAndView findByName(String houseName){
        ModelAndView mv = new ModelAndView();
        List<House> houseList = houseService.findByName(houseName);
        mv.addObject("houses",houseList);
        mv.setViewName("reserve_house");
        return mv;
    }

    //根据id查找房间
    @RequestMapping("/findById")
    public ModelAndView findById(int hid){
        ModelAndView mv = new ModelAndView();
        House house = houseService.findById(hid);
        mv.addObject("house",house);
        mv.setViewName("reserve_house_detail");
        return mv;
    }

    //查询房型首页信息
    @RequestMapping("/findAllHouse")
    public ModelAndView findAllHouse(){
        ModelAndView mv = new ModelAndView();
        //查询全部房间信息
        List<House> houseList = houseService.findAllHouse();
        mv.addObject("houseList",houseList);
        //查询各种房间状态的数量
        HouseCount houseCount = houseService.findCount();
        mv.addObject("houseCount",houseCount);
        mv.setViewName("cashier_find_house");
        return mv;
    }

    //根据房间型号查找相应房间
    @RequestMapping("/findByHouseName")
    public ModelAndView findByHouseName(String houseName){
        ModelAndView mv = new ModelAndView();
        //查询全部房间信息
        List<House> houseList = houseService.findByHouseName(houseName);
        mv.addObject("houseList",houseList);
        //查询各种房间状态的数量
        HouseCount houseCount = houseService.findCount();
        mv.addObject("houseCount",houseCount);
        mv.setViewName("cashier_find_house");
        return mv;
    }
    //多条件查询
    @RequestMapping("/findByMutiCondition")
    public ModelAndView findByMutiCondition(String houseNum,String houseState){
        ModelAndView mv = new ModelAndView();
        List<House> houseList= houseService.findByMutiCondition( houseNum, houseState);
        mv.addObject("houseList",houseList);
        HouseCount houseCount = houseService.findCount();
        mv.addObject("houseCount",houseCount);
        mv.setViewName("cashier_find_house");
        return mv;
    }

    //根据房间状态查询
    @RequestMapping("/findByHouseState")
    public ModelAndView findByHouseState(String houseState){
        ModelAndView mv = new ModelAndView();
        List<House> houseList= houseService.findByHouseState(houseState);
        mv.addObject("houseList",houseList);
        HouseCount houseCount = houseService.findCount();
        mv.addObject("houseCount",houseCount);
        mv.setViewName("cashier_find_house");
        return mv;
    }


    //拿一下参数再传给下一个页面
    @RequestMapping("/getHid")
    public ModelAndView getHid(int hid){
        ModelAndView mv = new ModelAndView();
        mv.addObject("hid",hid);
        mv.setViewName("cashier_CheckIn_SelectDate");
        return mv;
    }

    //根据id查找房间
    @RequestMapping("/findById2")
    public ModelAndView findById2(int hid,SelectDate selectDate){
        ModelAndView mv = new ModelAndView();
        House house = houseService.findById(hid);
        house.setHousePrice(selectDate.getCount()*house.getHousePrice());
        mv.addObject("house",house);
        mv.addObject("selectDate",selectDate);
        mv.setViewName("cashier_CheckIn_detail");
        return mv;
    }

    @RequestMapping("/findNotVacant")
    public ModelAndView findNotVacant(){
        ModelAndView mv = new ModelAndView();
        //查询全部房间信息
        List<House> houseList = houseService.findNotVacant();
        mv.addObject("houseList",houseList);
        mv.setViewName("cashier_CheckOut");
        return mv;
    }

    @RequestMapping("/updateToDirty")
    public String updateToDirty(int hid){
        houseService.updateToDirty(hid);
        return "redirect:findNotVacant";
    }

    @RequestMapping("/findDirty")
    public ModelAndView findDirty(){
        ModelAndView mv = new ModelAndView();
        //查询全部房间信息
        List<House> houseList = houseService.findDirty();
        mv.addObject("houseList",houseList);
        mv.setViewName("houser_sweep");
        return mv;
    }

    @RequestMapping("/updateToVacant")
    public String updateToVacant(int hid){
        houseService.updateToVacant(hid);
        return "redirect:findDirty";
    }
    //查询全部房间(分页查询)
    @RequestMapping("/findAllByPage")
    public ModelAndView findAllByPage(@RequestParam(name = "page" , required = true,defaultValue = "1") int page, @RequestParam(name = "size",required = true,defaultValue = "5") int size){
        ModelAndView mv = new ModelAndView();
        List<House> houseList =  houseService.findAllByPage(page,size);
        PageInfo pageInfo = new PageInfo(houseList);
        mv.addObject("pageInfo",pageInfo);
        mv.setViewName("houser_find_house");
        return mv;
    }

    @RequestMapping("/addHouse")
    public String addHouse(House house){
        houseService.addHouse(house);
        return "redirect:findAllByPage";
    }






}
