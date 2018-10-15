package com.guicestuff.consumer;

import com.google.inject.Inject;
import com.guicestuff.services.MessageService;

public class MyApplication {

    private MessageService messageService;

    //	constructor based injector
//	@Inject
//	public MyApplication(MessageService svc){
//		this.service=svc;
//	}


    //setter method injector
    @Inject
    public void setService(MessageService messageService){
        this.messageService = messageService;
    }

    public boolean sendMessage(String msg, String rec){

        //some business logic here

        return this.messageService.sendMessage(msg, rec);
    }

}
