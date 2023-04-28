package com.luongvandat.services.impl;

import com.luongvandat.entities.Author;
import com.luongvandat.repositories.AuthorRepository;
import com.luongvandat.services.AuthorServices;
import org.springframework.stereotype.Service;

@Service
public class AuthorServicesImpl implements AuthorServices {
    private final AuthorRepository authorRepository;

    public AuthorServicesImpl(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @Override
    public Author findOneById(String id) {
        return authorRepository.findById(id).orElse(null);
    }

    @Override
    public Author add(Author author) {
        return authorRepository.save(author);
    }

    @Override
    public Author deleteById(String id) {
        Author author = findOneById(id);
        authorRepository.deleteById(id);
        return author;
    }

    @Override
    public Author update(Author author) {
        return authorRepository.save(author);
    }
}