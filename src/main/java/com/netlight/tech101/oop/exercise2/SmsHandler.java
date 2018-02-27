package com.netlight.tech101.oop.exercise2;

public interface SmsHandler {

    /**
     * @param smsContent the incoming SMS command string.
     * @param senderUsername is the username of the user making the request.
     * @return The SMS content that should be returned to the user.
     */
    String handleSmsRequest(String smsContent, String senderUsername);

}
