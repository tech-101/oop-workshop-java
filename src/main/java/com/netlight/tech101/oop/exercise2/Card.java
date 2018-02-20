package com.netlight.tech101.oop.exercise2;

public class Card {

    private String id;
    private String cardholderName;
    private Status status;

    public enum Status {
        ACTIVE,
        LOCKED,
        CLOSED
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCardholderName() {
        return cardholderName;
    }

    public void setCardholderName(String cardholderName) {
        this.cardholderName = cardholderName;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
