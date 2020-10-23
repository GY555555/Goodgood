package com.jk.gy.controller;

import com.jk.gy.pojo.Order;
import com.jk.gy.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;

    @RequestMapping("orderList")
    public List<Order> orderList (){
        return orderService.orderList();
    }

    @RequestMapping("saveOrder")
    public void saveOrder(@RequestBody Order order){
        orderService.saveOrder(order);
    }

    @RequestMapping("delOrder")
    public String delOrder(@RequestParam Integer oid){
        orderService.delOrder(oid);
        return "success";
    }

    @RequestMapping("selOrder")
    public Order selOrder(@RequestParam Integer oid){
        return orderService.selOrder(oid);
    }


}
