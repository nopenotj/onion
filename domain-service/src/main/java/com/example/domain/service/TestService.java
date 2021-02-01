package com.example.domain.service;

import com.example.domain.Transaction;
import org.springframework.stereotype.Service;

@Service
public class TestService {

    public String run() {
        Transaction t = new Transaction();
        return "hi";
    }
}
