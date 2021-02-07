package com.example.application.services;

import com.example.domain.model.Transaction;
import com.example.domain.service.TransactionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransactionService {

    @Autowired
    TransactionRepo transactionRepo;

    public String run() {
        transactionRepo.insert(Transaction.builder().build());
        return "hi";
    }
}
