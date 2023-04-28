package com.luongvandat.controllers;

import com.luongvandat.services.AuthorServices;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/authors")
public class AuthorController {
    private final AuthorServices authorServices;

    public AuthorController(AuthorServices authorServices) {
        this.authorServices = authorServices;
    }
}