package com.example.springboottest.service;

import com.example.springboottest.RiskAssessor;
import org.springframework.stereotype.Service;

@Service
public class MyAccountService {

    private final RiskAssessor riskAssessor;

    public MyAccountService(RiskAssessor riskAssessor) {
        this.riskAssessor = riskAssessor;
    }

    public void doService() {
        riskAssessor.assess();
        //...
    }
}
