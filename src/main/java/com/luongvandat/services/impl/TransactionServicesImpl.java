package com.luongvandat.services.impl;

import com.luongvandat.repositories.TransactionRepository;
import com.luongvandat.services.TransactionServices;
import org.springframework.stereotype.Service;

@Service
public class TransactionServicesImpl implements TransactionServices {
    private TransactionRepository transactionRepository;

    public TransactionServicesImpl(TransactionRepository transactionRepository) {
        this.transactionRepository = transactionRepository;
    }
}