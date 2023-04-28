package com.luongvandat.services;

import com.luongvandat.entities.Publisher;

public interface PublisherServices {
    Publisher findOneById(String id);

    Publisher add(Publisher publisher);

    Publisher deleteById(String id);

    Publisher update(Publisher publisher);
}