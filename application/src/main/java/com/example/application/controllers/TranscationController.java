package com.example.application.controllers;

import com.example.application.services.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TranscationController {
    @Autowired
    TestService testService;

    @GetMapping("/")
    public String home() {
        return testService.run();
    }
}
