package com.jk.gy.service;

import com.jk.gy.dao.OrderMapper;
import com.jk.gy.pojo.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderMapper orderMapper;

    @Override
    public List<Order> orderList() {
        return orderMapper.orderList();
    }

    @Override
    public void saveOrder(Order order) {
        if (order.getOid()==null){
            orderMapper.insertSelective(order);
        }else {
            orderMapper.updateByPrimaryKeySelective(order);
        }
    }

    @Override
    public void delOrder(Integer oid) {
        orderMapper.deleteByPrimaryKey(oid);
    }

    @Override
    public Order selOrder(Integer oid) {
        return orderMapper.selectByPrimaryKey(oid);
    }
}
