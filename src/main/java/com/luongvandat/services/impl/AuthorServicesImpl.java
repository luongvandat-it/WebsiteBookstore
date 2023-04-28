package com.luongvandat.services.impl;

import com.luongvandat.repositories.AuthorRepository;
import com.luongvandat.services.AuthorServices;
import org.springframework.stereotype.Service;

@Service
public class AuthorServicesImpl implements AuthorServices {
    private AuthorRepository authorRepository;

    public AuthorServicesImpl(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }
}