package com.luongvandat.services;

import com.luongvandat.entities.Order_;

import java.util.Date;

public interface OrderServices {
    Order_ findOneById(String id);

    Order_ add(Order_ order_);

    Order_ deleteById(String id);

    Order_ update(Order_ order_);
    Order_ findOrder_ByOrderDate(Date date);
}