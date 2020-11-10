package com.example.demo.Annotations;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class ScienceTeacher implements Teacher {
    @Override
    public void teach() {
        System.out.println("I am your science teacher. All hail your science teacher.");
    }
}
