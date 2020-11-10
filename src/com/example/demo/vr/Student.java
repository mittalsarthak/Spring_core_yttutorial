package com.example.demo.vr;

public class Student {
    private String name;
    private String interestedCourse;
    private String hobby;

    public void setName(String name) {
        this.name = name;
    }

    public void setInterestedCourse(String interestedCourse) {
        this.interestedCourse = interestedCourse;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public void displayStudentInfo() {
        System.out.println("Name of the student is " + this.name);
        System.out.println("Student is interested in following course " + this.interestedCourse);
        System.out.println("Hobby of student is " + this.hobby);
    }
}
