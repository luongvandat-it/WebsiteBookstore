package com.luongvandat.services;

import com.luongvandat.entities.BookImage;

public interface BookImageServices {
    BookImage findOneById(String id);

    BookImage add(BookImage bookImage);

    BookImage deleteById(String id);

    BookImage update(BookImage bookImage);
}