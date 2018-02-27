package com.netlight.tech101.oop.exercise1;

import com.netlight.tech101.oop.exercise1.domain.Customer;
import com.netlight.tech101.oop.exercise1.domain.Order;
import com.netlight.tech101.oop.exercise1.domain.Product;
import com.netlight.tech101.oop.exercise1.infrastructure.SmtpMailClient;
import org.joda.money.Money;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class CustomerServiceTest {

    private CustomerService customerService = new CustomerService();

    private SmtpMailClient smtpMailClient = SmtpMailClient.getInstance();

    @Test
    public void testCreateAndLoadCustomer() {

        Customer c = customerService.createCustomer("Mickey", "Mouse");
        String customerId = c.getCustomerId();

        assertTrue(customerService.exists(customerId));

        Customer loadedCustomer = customerService.getCustomer(customerId);
        assertEquals("Mickey", loadedCustomer.getFirstName());
    }

    @Test
    public void testUpdateAndSendEmails() {
        Customer c = customerService.createCustomer("Donald", "Duck");
        String customerId = c.getCustomerId();

        customerService.updateCustomerEmailAddress(customerId, "donald.duck@gmail.com");

        assertTrue(customerService.hasEmail(customerId));

        Customer loadedCustomer = customerService.getCustomer(customerId);
        assertEquals("donald.duck@gmail.com", loadedCustomer.getEmail());

        customerService.sendEmail(c, "This is a test");

        List<String> emails = smtpMailClient.getMails("donald.duck@gmail.com");
        assertEquals(1, emails.size());
        assertEquals("This is a test", emails.get(0));
    }

    @Test
    public void testPlaceAndGetOrders() {
        Customer c = customerService.createCustomer("Woody", "Woodpecker");
        String customerId = c.getCustomerId();
        customerService.updateCustomerEmailAddress(customerId, "woody.woodpecker@gmail.com");

        Product keyboard = customerService.findProduct("Keyboard");
        Product mouse = customerService.findProduct("Mouse");

        Order order = customerService.createOrder(customerId, keyboard.getProductId(), mouse.getProductId());

        customerService.placeOrder(order);
        Money totalOrderCost = customerService.totalOrderCost(order);

        assertEquals(Money.parse("EUR 40"), totalOrderCost);

        List<String> emails = smtpMailClient.getMails("woody.woodpecker@gmail.com");

    }

}