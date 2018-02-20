package com.netlight.tech101.oop.exercise1;

import org.junit.Test;

import static org.junit.Assert.*;

public class CustomerServiceTest {

    private CustomerService customerService = new CustomerService();

    @Test
    public void testCreateCustomer() {

        Customer c = customerService.createCustomer("Mickey", "Mouse");
        assertTrue(customerService.exists(c.getCustomerId()));

        customerService.

    }

    @Test
    public void testUpdateCustomerEmail() {

    }

}