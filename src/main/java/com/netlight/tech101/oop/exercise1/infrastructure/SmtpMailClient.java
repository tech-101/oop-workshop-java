package com.netlight.tech101.oop.exercise1.infrastructure;

import java.util.*;

public class SmtpMailClient {

    private static SmtpMailClient instance;

    private Map<String, ArrayList<String>> sentMails = new HashMap<>();

    public static SmtpMailClient getInstance() {
        if (instance == null) {
            instance = new SmtpMailClient();
        }
        return instance;
    }

    public void sendEmail(String email, String content) {
        if (!sentMails.containsKey(email)) {
            sentMails.put(email, new ArrayList<String>());
        }
        sentMails.get(email).add(content);
    }

    public List<String> getMails(String email) {
        return sentMails.get(email);
    }

}
