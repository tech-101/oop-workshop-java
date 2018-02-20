package com.netlight.tech101.oop.exercise2;

import java.util.HashSet;
import java.util.Set;

public class CardService {

    public void issueCard(String cardholderName) {

    }

    public void lockCard(Card card) {
        validateCardInState(card, Card.Status.ACTIVE);
        card.setStatus(Card.Status.LOCKED);
        Logger.info("locked card");
    }

    public void unlockCard(Card card) {
        validateCardInState(card, Card.Status.LOCKED);
        card.setStatus(Card.Status.ACTIVE);
    }

    public void closeCard(Card card) {
        validateCardInState(card, Card.Status.ACTIVE, Card.Status.LOCKED);
        card.setStatus(Card.Status.CLOSED);
    }

    private void validateCardInState(Card card, Card.Status... expectedState) {
//        Set<Card.Status> states = new HashSet<Card.Status>(expectedState);
//        if (!states.contains(card.getStatus()) {
//            throw new IllegalStateException("Invalid card state: " + expectedState);
//        }
    }

}
