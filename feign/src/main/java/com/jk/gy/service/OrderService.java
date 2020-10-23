package com.jk.gy.service;

import com.jk.gy.pojo.Order;
import com.jk.gy.service.hystrix.OrderServiceHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(value = "order-proviter",fallback = OrderServiceHystrix.class)
public interface OrderService {

    @RequestMapping("orderList")
    public List<Order> orderList ();

    @RequestMapping("saveOrder")
    public void saveOrder(@RequestBody Order order);

    @RequestMapping("delOrder")
    public String delOrder(@RequestParam Integer oid);

    @RequestMapping("selOrder")
    public Order selOrder(@RequestParam Integer oid);

    @RequestMapping("drq")
    String drq();

}
