package com.example.demo.vr;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    public static void main (String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/example/demo/vr/conf.xml");
        System.out.println("conf.xml file loaded");
        Student student = context.getBean("student", Student.class);
        student.displayStudentInfo();
    }
}
