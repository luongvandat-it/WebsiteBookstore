package com.luongvandat.services.impl;

import com.luongvandat.repositories.BookImageRepository;
import com.luongvandat.services.BookImageServices;
import org.springframework.stereotype.Service;

@Service
public class BookImageServicesImpl implements BookImageServices {
    private BookImageRepository bookImageRepository;

    public BookImageServicesImpl(BookImageRepository bookImageRepository) {
        this.bookImageRepository = bookImageRepository;
    }
}