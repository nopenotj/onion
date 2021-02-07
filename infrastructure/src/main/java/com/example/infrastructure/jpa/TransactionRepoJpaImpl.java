package com.example.infrastructure.jpa;

import com.example.domain.model.Transaction;
import com.example.domain.service.TransactionRepo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionRepoJpaImpl extends JpaRepository<Transaction, String> {
}
