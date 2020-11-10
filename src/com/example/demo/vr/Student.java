package com.example.demo.vr;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;

public class Student {
    private String name;
    private String interestedCourse;
    private String hobby;

    @Required
    @Value("${student.name}")
    public void setName(String name) {
        this.name = name;
    }


    @Value("${student.interestedCourse}")
    public void setInterestedCourse(String interestedCourse) {
        this.interestedCourse = interestedCourse;
    }

    @Value("${student.hobby}")
    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public void displayStudentInfo() {
        System.out.println("Name of the student is " + this.name);
        System.out.println("Student is interested in following course: " + this.interestedCourse);
        System.out.println("Hobby of student is " + this.hobby);
    }
}
