package com.luongvandat.services;

import com.luongvandat.entities.Author;

public interface AuthorServices {
    Author findOneById(String id);

    Author add(Author author);

    Author deleteById(String id);

    Author update(Author author);
}