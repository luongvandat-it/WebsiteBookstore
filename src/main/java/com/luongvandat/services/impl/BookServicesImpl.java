package com.luongvandat.services.impl;

import com.luongvandat.repositories.BookRepository;
import com.luongvandat.services.BookServices;
import org.springframework.stereotype.Service;

@Service
public class BookServicesImpl implements BookServices {
    private BookRepository bookRepository;

    public BookServicesImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
}