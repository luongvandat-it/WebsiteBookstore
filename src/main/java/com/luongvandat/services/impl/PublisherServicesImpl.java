package com.luongvandat.services.impl;

import com.luongvandat.entities.Publisher;
import com.luongvandat.repositories.PublisherRepository;
import com.luongvandat.services.PublisherServices;
import org.springframework.stereotype.Service;

@Service
public class PublisherServicesImpl implements PublisherServices {
    private final PublisherRepository publisherRepository;

    public PublisherServicesImpl(PublisherRepository publisherRepository) {
        this.publisherRepository = publisherRepository;
    }

    @Override
    public Publisher findOneById(String id) {
        return publisherRepository.findById(id).orElse(null);
    }

    @Override
    public Publisher add(Publisher publisher) {
        return publisherRepository.save(publisher);
    }

    @Override
    public Publisher deleteById(String id) {
        Publisher publisher = findOneById(id);
        publisherRepository.deleteById(id);
        return publisher;
    }

    @Override
    public Publisher update(Publisher publisher) {
        return publisherRepository.save(publisher);
    }
}