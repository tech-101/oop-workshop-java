package com.netlight.tech101.oop.exercise1.domain;

import org.joda.money.Money;

import java.util.UUID;

public class Product {

    private final String productId;
    private final String productName;
    private final String productDescription;
    private final Money price;

    public Product(String productName, String productDescription, Money price) {
        this.productId = UUID.randomUUID().toString();
        this.productName = productName;
        this.productDescription = productDescription;
        this.price = price;
    }

    public String getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public Money getPrice() {
        return price;
    }
}
