package com.luongvandat.services.impl;

import com.luongvandat.entities.OrderDetail;
import com.luongvandat.repositories.OrderDetailRepository;
import com.luongvandat.services.OrderDetailServices;
import org.springframework.stereotype.Service;

@Service
public class OrderDetailServicesImpl implements OrderDetailServices {
    private final OrderDetailRepository orderDetailRepository;

    public OrderDetailServicesImpl(OrderDetailRepository orderDetailRepository) {
        this.orderDetailRepository = orderDetailRepository;
    }

    @Override
    public OrderDetail findOneById(String id) {
        return orderDetailRepository.findById(id).orElse(null);
    }

    @Override
    public OrderDetail add(OrderDetail orderDetail) {
        return orderDetailRepository.save(orderDetail);
    }

    @Override
    public OrderDetail deleteById(String id) {
        OrderDetail orderDetail = findOneById(id);
        orderDetailRepository.deleteById(id);
        return orderDetail;
    }

    @Override
    public OrderDetail update(OrderDetail orderDetail) {
        return orderDetailRepository.save(orderDetail);
    }

    @Override
    public OrderDetail saveOrderDetail(double price, int quantity, String bookId, String orderId) {
        return orderDetailRepository.saveOrderDetail(price, quantity, bookId, orderId);
    }
}