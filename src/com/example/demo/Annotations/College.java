package com.example.demo.Annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class College {
    @Autowired
    private Principal principal;
//    (Annotations can be used if component annotations is used to create bean)

    @Autowired
    @Qualifier("mathTeacher")
    private Teacher teacher;

    @Value("${college.name}")
    private String collegeName;

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

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public void test() {
        System.out.println("1 2 3 testing testing....");
        principal.displayInfo();
        teacher.teach();
        System.out.println("College Name is " + this.collegeName);
    }
}
