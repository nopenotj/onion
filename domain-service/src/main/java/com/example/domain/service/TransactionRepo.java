package com.example.domain.service;

import com.example.domain.model.Transaction;

public interface TransactionRepo {
    public void insert(Transaction transaction);
}
