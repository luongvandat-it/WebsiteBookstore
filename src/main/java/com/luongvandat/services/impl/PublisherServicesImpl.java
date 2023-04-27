package com.luongvandat.services.impl;

import com.luongvandat.repositories.PublisherRepository;
import com.luongvandat.services.PublisherServices;
import org.springframework.stereotype.Service;

@Service
public class PublisherServicesImpl implements PublisherServices {
    private PublisherRepository publisherRepository;

    public PublisherServicesImpl(PublisherRepository publisherRepository) {
        this.publisherRepository = publisherRepository;
    }
}