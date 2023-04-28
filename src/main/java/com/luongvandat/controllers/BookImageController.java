package com.luongvandat.controllers;

import com.luongvandat.services.BookImageServices;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/bookImages")
public class BookImageController {
    private final BookImageServices bookImageServices;

    public BookImageController(BookImageServices bookImageServices) {
        this.bookImageServices = bookImageServices;
    }
}