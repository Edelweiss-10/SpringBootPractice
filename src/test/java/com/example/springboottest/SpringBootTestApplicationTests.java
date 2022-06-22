package com.example.springboottest;

import com.example.springboottest.service.MyAccountService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBootTestApplicationTests {

    @Autowired
    private MyAccountService myAccountService;

    @Test
    void contextLoads() {
        myAccountService.doService();
    }

}
