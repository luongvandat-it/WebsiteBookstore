package com.luongvandat.controllers;

import com.luongvandat.services.OrderServices;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/order_s")
public class OrderController {
    private final OrderServices orderServices;

    public OrderController(OrderServices orderServices) {
        this.orderServices = orderServices;
    }
}