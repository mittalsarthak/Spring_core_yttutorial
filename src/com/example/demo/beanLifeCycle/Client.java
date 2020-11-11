package com.example.demo.beanLifeCycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLException;

public class Client {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/example/demo/beanLifeCycle/conf.xml");
        PersonDAO db = context.getBean("connection", PersonDAO.class);
        db.DisplaySomeRows();
        context.close();
    }
}
