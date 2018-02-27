package com.netlight.tech101.oop.exercise2.support;

import java.math.BigDecimal;
import java.util.List;

public interface TransferManager {

    void sendMoney(String senderUsername, String recipientUsername, BigDecimal amount);

    List<BigDecimal> getAllTransactions(String senderUsername, String recipientUsername);

}