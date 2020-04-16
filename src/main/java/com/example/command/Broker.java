package com.example.command;

import java.util.List;

/**
 * @Author: peili.wang
 * @Date: 2020/4/16 22:26
 */
public class Broker {
    private List<Order> orders;

    public Broker(List<Order> orders) {
        this.orders = orders;
    }

    public void takeOrder(Order order) {
        orders.add(order);
    }

    public void placeOrder() {
        for (Order order : orders) {
            order.execute();
        }
        orders.clear();
    }
}
