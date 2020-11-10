package com.example.demo.autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {
    private Heart heart;

    public Human (){
        System.out.println("Default Constructor is being called");
    }


    public Human(Heart heart) {
        this.heart = heart;
        System.out.println("Parameterized Constructor is being called");
    }

    @Autowired
    @Qualifier("humanHeart")
    public void setHeart(Heart heart) {
        this.heart = heart;
    }

    public void startPumping() {
        if(heart != null) {
            heart.pump();
            System.out.println("Name of the animal is:" + heart.getNameOfAnimal());
            System.out.println("Number of hearts present are:" + heart.getNoOfHearts());
        }
        else{
            System.out.println("You are dead..");
        }
    }
}
