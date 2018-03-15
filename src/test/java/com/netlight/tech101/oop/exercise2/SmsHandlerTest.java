package com.netlight.tech101.oop.exercise2;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SmsHandlerTest {

    public static final String DEVICE_ID = "myDeviceId";

    private SmsHandler smsHandler = new SmsHandlerImpl();

    @Test
    public void testBalanceCommand() {
        String response = smsHandler.handleSmsRequest("BALANCE", DEVICE_ID);
        assertEquals("1500", response);
    }

    @Test
    public void testSendOk() {
        String response = smsHandler.handleSmsRequest("SEND-100-FFRITZ", DEVICE_ID);
        assertEquals("OK", response);
    }

    @Test
    public void testSendInsufficientFunds() {
        String response = smsHandler.handleSmsRequest("SEND-100-FFRITZ", DEVICE_ID);
        assertEquals("ERR – INSUFFICIENT FUNDS", response);
    }

    @Test
    public void testSendNoUser() {
        String response = smsHandler.handleSmsRequest("SEND-100-FFRITZ", DEVICE_ID);
        assertEquals("ERR – NO USER", response);
    }

    @Test
    public void testTotalSent() {
        String response = smsHandler.handleSmsRequest("TOTALSENT-FFRITZ", DEVICE_ID);
        assertEquals("ERR – NO USER", response);
    }

}
