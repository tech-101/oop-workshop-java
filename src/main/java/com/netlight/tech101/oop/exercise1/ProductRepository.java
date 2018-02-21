package com.netlight.tech101.oop.exercise1;

import org.joda.money.Money;

import java.util.HashSet;
import java.util.Set;

public class ProductRepository {

    private static ProductRepository instance;

    private Set<Product> productData = new HashSet<>();

    public static ProductRepository getInstance() {
        if (instance == null) {
            instance = new ProductRepository();
        }
        return instance;
    }

    private ProductRepository() {
        initData();
    }

    private void initData() {
        productData.add(new Product("Keyboard", "Mechanical computer keyboard", Money.parse("EUR 25")));
        productData.add(new Product("Mouse", "Amazing computer mouse", Money.parse("EUR 15")));
        productData.add(new Product("LCD Monitor", "Hi res display", Money.parse("EUR 350")));
        productData.add(new Product("Speakers", "Very loud speakers for music and games", Money.parse("EUR 150")));
    }

    public Product findById(String productId) {
        for (Product p : productData) {
            if (productId.equals(p.getProductId())) {
                return p;
            }
        }
        return null;
    }

    public Product findByName(String productName) {
        for (Product p : productData) {
            if (productName.equals(p.getProductName())) {
                return p;
            }
        }
        return null;
    }

    public Set<Product> findAll() {
        return productData;
    }

    public void save(Product product) {
        this.productData.add(product);
    }

}
