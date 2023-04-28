package com.luongvandat.services.impl;

import com.luongvandat.entities.Order_;
import com.luongvandat.repositories.OrderRepository;
import com.luongvandat.services.OrderServices;
import org.springframework.stereotype.Service;

@Service
public class OrderServicesImpl implements OrderServices {
    private final OrderRepository orderRepository;

    public OrderServicesImpl(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public Order_ findOneById(String id) {
        return orderRepository.findById(id).orElse(null);
    }

    @Override
    public Order_ add(Order_ order_) {
        return orderRepository.save(order_);
    }

    @Override
    public Order_ deleteById(String id) {
        Order_ order_ = findOneById(id);
        orderRepository.deleteById(id);
        return order_;
    }

    @Override
    public Order_ update(Order_ order_) {
        return orderRepository.save(order_);
    }
}