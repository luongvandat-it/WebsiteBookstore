package com.luongvandat.services;

import com.luongvandat.entities.Book;

import java.util.List;

public interface BookServices {
    Book findOneById(String id);

    Book add(Book book);

    Book deleteById(String id);

    Book update(Book book);

    List<Book> findBooksByBookTitleContainsIgnoreCase(String bookTitle);
}