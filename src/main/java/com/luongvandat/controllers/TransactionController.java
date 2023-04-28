package com.luongvandat.controllers;

import com.luongvandat.services.TransactionServices;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/transaction_s")
public class TransactionController {
    private final TransactionServices transactionServices;

    public TransactionController(TransactionServices transactionServices) {
        this.transactionServices = transactionServices;
    }
}