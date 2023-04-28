package com.luongvandat.controllers;

import com.luongvandat.services.PublisherServices;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/publishers")
public class PublisherController {
    private final PublisherServices publisherServices;

    public PublisherController(PublisherServices publisherServices) {
        this.publisherServices = publisherServices;
    }
}