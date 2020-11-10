package com.example.demo;

public class Airtel {
    private Service service;

    public void setService(Service service) {
        this.service = service;
    }

    public void ActivateService() {
        service.service();
    }
}
