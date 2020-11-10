package com.example.demo.Annotations;


import org.springframework.stereotype.Component;

@Component
public class MathTeacher implements Teacher{

    public MathTeacher() {
        System.out.println("Mmamammm");
    }

    @Override
    public void teach() {
        System.out.println("I am your maths teacher. All hail your math teacher.");
    }
}
