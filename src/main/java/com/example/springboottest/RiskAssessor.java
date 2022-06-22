package com.example.springboottest;

import org.springframework.stereotype.Component;

@Component
public class RiskAssessor {

    public void assess() {
        System.out.println("Assess");
    }

    public RiskAssessor() {
        System.out.println("My Account Service Constructor");
    }
}
