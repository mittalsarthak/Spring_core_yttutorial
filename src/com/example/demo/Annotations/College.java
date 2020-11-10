package com.example.demo.Annotations;

import org.springframework.stereotype.Component;


public class College {
    public Principal principal;

    public College(){
        System.out.println("Default Constructor Called");
    }

    public College(Principal principal) {
        this.principal = principal;
        System.out.println("Paramaterized Constructor Called");
    }

    public void setPrincipal(Principal principal) {
        this.principal = principal;
        System.out.println("Setter Method Called");
    }

    public void test() {
        System.out.println("1 2 3 testing testing....");
        principal.displayInfo();
    }
}
