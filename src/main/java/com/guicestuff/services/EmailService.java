package com.guicestuff.services;

public class EmailService implements MessageServices {

    public boolean sendMessage(String msg, String recipient) {

        System.out.println("Email Message sent to " + recipient + " with message=" + msg);

        return true;
    }
}
