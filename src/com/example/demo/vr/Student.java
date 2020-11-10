package com.example.demo.vr;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;

public class Student {
    @Value("${student.name}")
    private String name;

    @Value("${student.interestedCourse}")
    private String interestedCourse;

    @Value("${student.hobby}")
    private String hobby;


    public void displayStudentInfo() {
        System.out.println("Name of the student is " + this.name);
        System.out.println("Student is interested in following course: " + this.interestedCourse);
        System.out.println("Hobby of student is " + this.hobby);
    }
}
