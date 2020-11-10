package com.example.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("/com/example/demo/dij/conf.xml");
        System.out.println("Config file loaded");
        Airtel airtel = context.getBean("AirtelUser", Airtel.class);
        airtel.ActivateService();
    }
}
