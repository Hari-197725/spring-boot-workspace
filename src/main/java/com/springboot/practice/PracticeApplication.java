package com.springboot.practice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication //This is the annotation which represents this is a spring boot application.
//@ComponentScan("com.springboot.work") This annotation is used for when you add other components into it then it can
//scan and understand what are all the classes and beans comes under spring and then manage when spring boot application started.
public class PracticeApplication {

    public static void main(String[] args) {
        SpringApplication.run(PracticeApplication.class, args);
    }
}