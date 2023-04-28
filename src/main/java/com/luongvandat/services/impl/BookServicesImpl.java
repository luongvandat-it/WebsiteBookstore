package com.luongvandat.services.impl;

import com.luongvandat.entities.Book;
import com.luongvandat.repositories.BookRepository;
import com.luongvandat.services.BookServices;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServicesImpl implements BookServices {
    private final BookRepository bookRepository;

    public BookServicesImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public List<Book> findAll() {
        return bookRepository.findAll();
    }

    @Override
    public Book findOneById(String id) {
        return bookRepository.findById(id).orElse(null);
    }

    @Override
    public Book add(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public Book deleteById(String id) {
        Book book = findOneById(id);
        bookRepository.deleteById(id);
        return book;
    }

    @Override
    public Book update(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public List<Book> findBooksByBookTitleContainsIgnoreCase(String bookTitle) {
        return bookRepository.findBooksByBookTitleContainsIgnoreCase(bookTitle);
    }
}