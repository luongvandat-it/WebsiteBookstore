package com.luongvandat.services.impl;

import com.luongvandat.repositories.OrderRepository;
import com.luongvandat.services.OrderServices;
import org.springframework.stereotype.Service;

@Service
public class OrderServicesImpl implements OrderServices {
    private OrderRepository orderRepository;

    public OrderServicesImpl(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }
}