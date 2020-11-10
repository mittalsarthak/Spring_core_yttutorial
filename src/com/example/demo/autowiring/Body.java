package com.example.demo.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Body {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/example/demo/autowiring/conf.xml");
        Human human = context.getBean("human", Human.class);
        human.startPumping();
    }
}
