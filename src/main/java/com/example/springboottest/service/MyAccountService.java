package com.example.springboottest.service;

import com.example.springboottest.RiskAssessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.PrintStream;

@Service
public class MyAccountService {

    private final RiskAssessor riskAssessor;
    private final PrintStream out;

    @Autowired
    public MyAccountService(RiskAssessor riskAssessor) {
        System.out.println("My Account Service Constructor");
        this.riskAssessor = riskAssessor;
        this.out = System.out;
    }

    public MyAccountService(RiskAssessor riskAssessor, PrintStream out) {
        this.riskAssessor = riskAssessor;
        this.out = out;

    }

    public void doService() {
        riskAssessor.assess();
        //...
    }
}
