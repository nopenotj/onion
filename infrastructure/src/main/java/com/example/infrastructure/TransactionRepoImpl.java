package com.example.infrastructure;

import com.example.domain.model.Transaction;
import com.example.domain.service.TransactionRepo;
import com.example.infrastructure.jpa.TransactionRepoJpaImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class TransactionRepoImpl implements TransactionRepo {
    @Autowired
    TransactionRepoJpaImpl transactionRepoJpa;

    @Override
    public void insert(Transaction transaction) {
        transactionRepoJpa.save(transaction);
    }
}
