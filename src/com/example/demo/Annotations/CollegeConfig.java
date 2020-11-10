package com.example.demo.Annotations;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CollegeConfig {

    public Principal principalBean() {
        return new Principal();
    }

    @Bean
    public College collegeBean() {
//        Dependency Injection using a constructor
//        College college = new College(principalBean());
//        return college;
//         Dependency Injection using a setter
        College college = new College();
        college.setPrincipal(principalBean());
        return college;
    }
}
