package com.luongvandat.services.impl;

import com.luongvandat.repositories.CommentRepository;
import com.luongvandat.services.CommentServices;
import org.springframework.stereotype.Service;

@Service
public class CommentServicesImpl implements CommentServices {
    private CommentRepository repository;

    public CommentServicesImpl(CommentRepository repository) {
        this.repository = repository;
    }
}