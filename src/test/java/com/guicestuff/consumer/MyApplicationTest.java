package com.guicestuff.consumer;

import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.guicestuff.services.MessageService;
import com.guicestuff.services.MockMessageService;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertTrue;

class MyApplicationTest {

    private Injector injector;

    @BeforeEach
    void setUp(){

        injector = Guice.createInjector(new AbstractModule() {
            @Override
            protected void configure() {
                bind(MessageService.class).to(MockMessageService.class);
            }
        });
    }

    @AfterEach
    void tearDown() {
        injector = null;
    }

    @Test
    @DisplayName("sendMessage() to return true")
    void sendMessage() {
        MyApplication appTest = injector.getInstance(MyApplication.class);

        assertTrue(appTest.sendMessage("Just Testing", "BPourian"));
    }

}