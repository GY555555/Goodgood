package com.jk.gy.controller;

import com.jk.gy.pojo.Order;
import com.jk.gy.service.OrderService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class OrderController {

    @Resource
    private OrderService orderService;

    @RequestMapping("orderList")
    public String orderList(Model model){
        List<Order> list = orderService.orderList();
        model.addAttribute("order",list);
        return "listorder";
    }

    @RequestMapping("List")
    @ResponseBody
    public List<Order> List(){
        List<Order> list = orderService.orderList();
        return list;
    }

    @RequestMapping("toAdd")
    public String add(Model model){
        model.addAttribute("order",new Order());
        return "orderadd";
    }

    @RequestMapping("delOrder")
    public String delOrder(Integer oid){
        orderService.delOrder(oid);
        return "redirect:orderList";
    }


    @RequestMapping("selOrder")
    public String selOrder(Integer oid,Model model){
        Order order = orderService.selOrder(oid);
        model.addAttribute("order",order);
        return "orderadd";
    }

    @RequestMapping("saveOrder")
    public String saveOrder(Order order){
        orderService.saveOrder(order);
        return "redirect:orderList";
    }

    @RequestMapping("drq")
    @ResponseBody
    public String drq(){
       String na = orderService.drq();
        return na;
    }


}
