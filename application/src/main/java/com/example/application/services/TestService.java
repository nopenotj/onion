package com.example.application.services;

import com.example.domain.model.Transaction;
import org.springframework.stereotype.Service;

@Service
public class TestService {

    public String run() {
        Transaction t = new Transaction();
        return "hi";
    }
}
