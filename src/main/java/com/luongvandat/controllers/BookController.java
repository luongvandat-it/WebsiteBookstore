package com.luongvandat.controllers;

import com.luongvandat.entities.Book;
import com.luongvandat.services.BookServices;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {
    private final BookServices bookServices;

    public BookController(BookServices bookServices) {
        this.bookServices = bookServices;
    }

    @PostMapping("/findAll")
    public List<Book> findAll() {
        return bookServices.findAll();
    }

    @PostMapping("/findByName")
    public List<Book> findByName(String name) {
        return bookServices.findBooksByBookTitleContainsIgnoreCase(name);
    }
}