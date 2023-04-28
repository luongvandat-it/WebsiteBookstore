package com.luongvandat.services;

import com.luongvandat.entities.Order_;

public interface OrderServices {
    Order_ findOneById(String id);

    Order_ add(Order_ order_);

    Order_ deleteById(String id);

    Order_ update(Order_ order_);
}