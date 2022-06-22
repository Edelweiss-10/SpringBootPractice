package com.example.springboottest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;


//@ComponentScan(basePackageClasses = {com.example.springboottest.service.MyAccountService.class, com.example.springboottest.RiskAssessor.class})
//@ComponentScan(value = {"com.example.springboottest"})
@ComponentScan
@EnableAutoConfiguration
//@SpringBootApplication
public class SpringBootTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootTestApplication.class, args);

    }

}
