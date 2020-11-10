package com.example.demo.Annotations;

import org.springframework.stereotype.Component;

@Component
public class Principal {
    public void displayInfo() {
        System.out.println("I am your Principal. All hail your principal");
    }
}
