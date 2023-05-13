package com.luongvandat.services;

import com.luongvandat.entities.Book;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface BookServices {
    Book findOneById(String id);

    Book add(Book book);

    Book deleteById(String id);

    Book update(Book book);

    List<Book> findBooksByBookTitleContainsIgnoreCase(String bookTitle);

    List<Book> findBooksByBookIdBetween(String low, String high);

    Book findBookByBookTitleIgnoreCase(String bookTitle);

    Page<Book> findBookByBookTitleIgnoreCaseWithPageable(String bookTitle, Pageable pageable);
}