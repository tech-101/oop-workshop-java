package com.netlight.tech101.oop.exercise1;

import java.util.HashSet;
import java.util.Set;

public class CustomerRepository {

    private static CustomerRepository instance;

    private Set<Customer> customerData = new HashSet<>();

    public static CustomerRepository getInstance() {
        if (instance == null) {
            instance = new CustomerRepository();
        }
        return instance;
    }

    private CustomerRepository() {
        initData();
    }

    private void initData() {
        customerData.add(new Customer("Joe", "Bloggs", "joe.bloggs@hotmail.com"));
        customerData.add(new Customer("Lucy", "Smith", null));
        customerData.add(new Customer("Fischer", "Fritz", "frische.fische@gmail.com"));
        customerData.add(new Customer("Amanda", "Jones", "amanda.jones@gmail.com"));
    }

    public Customer findById(String customerId) {
        for (Customer c : customerData) {
            if (customerId.equals(c.getCustomerId())) {
                return c;
            }
        }
        return null;
    }

    public Set<Customer> findAll() {
        return customerData;
    }

    public void save(Customer customer) {
        this.customerData.add(customer);
    }

}
