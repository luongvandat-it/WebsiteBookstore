package com.luongvandat.services.impl;

import com.luongvandat.entities.BookImage;
import com.luongvandat.repositories.BookImageRepository;
import com.luongvandat.services.BookImageServices;
import org.springframework.stereotype.Service;

@Service
public class BookImageServicesImpl implements BookImageServices {
    private final BookImageRepository bookImageRepository;

    public BookImageServicesImpl(BookImageRepository bookImageRepository) {
        this.bookImageRepository = bookImageRepository;
    }

    @Override
    public BookImage findOneById(String id) {
        return bookImageRepository.findById(id).orElse(null
        );
    }

    @Override
    public BookImage add(BookImage bookImage) {
        return bookImageRepository.save(bookImage);
    }

    @Override
    public BookImage deleteById(String id) {
        BookImage bookImage = findOneById(id);
        bookImageRepository.deleteById(id);
        return bookImage;
    }

    @Override
    public BookImage update(BookImage bookImage) {
        return bookImageRepository.save(bookImage);
    }
}