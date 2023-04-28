package com.luongvandat.services.impl;

import com.luongvandat.repositories.OrderDetailRepository;
import com.luongvandat.services.OrderDetailServices;
import org.springframework.stereotype.Service;

@Service
public class OrderDetailServicesImpl implements OrderDetailServices {
    private OrderDetailRepository orderDetailRepository;

    public OrderDetailServicesImpl(OrderDetailRepository orderDetailRepository) {
        this.orderDetailRepository = orderDetailRepository;
    }
}