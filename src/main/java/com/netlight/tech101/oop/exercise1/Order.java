package com.netlight.tech101.oop.exercise1;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

public class Order {

    private String orderId;
    private Customer customer;
    private Set<Product> products;

    public Order(Customer customer) {
        this.orderId = UUID.randomUUID().toString();
        this.customer = customer;
        this.products = new HashSet<>();
    }

    public void addProduct(Product product) {
        this.products.add(product);
    }

    public Set<Product> getProducts() {
        return this.products;
    }

    public Customer getCustomer() {
        return this.customer;
    }

    public String getOrderId() {
        return orderId;
    }

}
