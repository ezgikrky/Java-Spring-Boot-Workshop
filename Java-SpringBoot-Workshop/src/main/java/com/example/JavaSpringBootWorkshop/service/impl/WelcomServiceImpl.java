package com.example.JavaSpringBootWorkshop.service.impl;

import com.example.JavaSpringBootWorkshop.service.WelcomeService;
import org.springframework.stereotype.Service;

@Service
public class WelcomServiceImpl implements WelcomeService {

    public String sayHi(String name) {
        return "Hello! " + name;
    }
}
