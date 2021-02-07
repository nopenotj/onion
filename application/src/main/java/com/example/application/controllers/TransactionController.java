package com.example.application.controllers;

import com.example.application.services.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TransactionController {
    @Autowired
    TransactionService transactionService;

    @GetMapping("/")
    public String home() {
        return transactionService.run();
    }
}
