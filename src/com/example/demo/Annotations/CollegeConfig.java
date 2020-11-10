package com.example.demo.Annotations;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:com/example/demo/Annotations/college-info.properties")
@ComponentScan(basePackages = "com/example/demo/Annotations")
public class CollegeConfig {

//    @Bean
//    public Teacher mathTeacherBean() {
//        return new MathTeacher();
//    }
//
//    @Bean
//    public Principal principalBean() {
//        return new Principal();
//    }
//
//    @Bean
//    public College collegeBean() {
////        Dependency Injection using a constructor
////        College college = new College(principalBean());
////        return college;
////         Dependency Injection using a setter
//        College college = new College();
//        college.setPrincipal(principalBean());
//        college.setTeacher(mathTeacherBean());
//        return college;
//    }
}
