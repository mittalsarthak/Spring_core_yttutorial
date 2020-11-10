package com.example.demo.Annotations;


import org.springframework.stereotype.Component;

@Component
public class MathTeacher implements Teacher{

    @Override
    public void teach() {
        System.out.println("I am your maths teacher. All hail your math teacher.");
    }
}
