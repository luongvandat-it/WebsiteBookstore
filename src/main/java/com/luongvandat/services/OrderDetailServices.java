package com.luongvandat.services;

import com.luongvandat.entities.OrderDetail;

public interface OrderDetailServices {
    OrderDetail findOneById(String id);

    OrderDetail add(OrderDetail orderDetail);

    OrderDetail deleteById(String id);

    OrderDetail update(OrderDetail orderDetail);
}