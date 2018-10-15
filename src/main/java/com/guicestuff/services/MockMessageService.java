package com.guicestuff.services;

public class MockMessageService implements MessageService {

    public boolean sendMessage(String msg, String recipient) {
        return true;
    }
}
