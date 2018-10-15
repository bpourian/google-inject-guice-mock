package com.guicestuff.services;

import com.google.inject.Singleton;

//import com.google.inject.Singleton;

/* a singleton class is a class that can have
only one object (an instance of the class) at a time. */

@Singleton
public class FacebookService implements MessageService {

    public boolean sendMessage(String msg, String recipient) {

        System.out.println("Message sent to Facebook user "+recipient+" with message="+msg);

        return true;
    }
}
