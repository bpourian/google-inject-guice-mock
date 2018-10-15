package com.guicestuff;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.guicestuff.consumer.MyApplication;
import com.guicestuff.injector.AppInjector;

/**
 * main class
 *
 * @author Benjamin Pourian
 */
public class App 
{
    public static void main( String[] args )
    {
        Injector injector = Guice.createInjector(new AppInjector());

        MyApplication myApplication = injector.getInstance(MyApplication.class);

        myApplication.sendMessage("This is guice in action", "BPourian");
    }
}
