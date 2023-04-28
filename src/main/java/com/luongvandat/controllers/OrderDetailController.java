package com.luongvandat.controllers;

import com.luongvandat.services.OrderDetailServices;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/orderDetails")
public class OrderDetailController {
    private final OrderDetailServices orderDetailServices;

    public OrderDetailController(OrderDetailServices orderDetailServices) {
        this.orderDetailServices = orderDetailServices;
    }
}