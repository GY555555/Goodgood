package com.jk.gy.service;


import com.jk.gy.pojo.Order;

import java.util.List;

public interface OrderService {
    List<Order> orderList();

    void saveOrder(Order order);

    void delOrder(Integer oid);

    Order selOrder(Integer oid);
}
