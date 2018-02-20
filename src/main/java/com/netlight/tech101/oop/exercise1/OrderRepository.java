package com.netlight.tech101.oop.exercise1;

import java.util.HashSet;
import java.util.Set;

public class OrderRepository {

    private static OrderRepository instance;

    private Set<Order> orderData = new HashSet<>();

    public static OrderRepository getInstance() {
        if (instance == null) {
            instance = new OrderRepository();
        }
        return instance;
    }

    private OrderRepository() {

    }

    public Order findById(String orderId) {
        for (Order c : orderData) {
            if (orderId.equals(c.getOrderId())) {
                return c;
            }
        }
        return null;
    }

    public Set<Order> findAll() {
        return orderData;
    }

    public void save(Order order) {
        this.orderData.add(order);
    }

}
