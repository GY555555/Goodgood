package com.jk.gy.service.hystrix;

import com.jk.gy.pojo.Order;
import com.jk.gy.service.OrderService;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class OrderServiceHystrix implements OrderService {
    @Override
    public List<Order> orderList() {
        return null;
    }

    @Override
    public void saveOrder(Order order) {

    }

    @Override
    public String delOrder(Integer oid) {
        return null;
    }

    @Override
    public Order selOrder(Integer oid) {
        return null;
    }

    @Override
    public String drq() {
        return"错误";
    }


}
