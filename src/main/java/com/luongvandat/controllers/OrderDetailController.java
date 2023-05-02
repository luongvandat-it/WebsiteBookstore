package com.luongvandat.controllers;

import com.luongvandat.entities.OrderDetail;
import com.luongvandat.services.OrderDetailServices;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/orderDetails")
public class OrderDetailController {
    private final OrderDetailServices orderDetailServices;

    public OrderDetailController(OrderDetailServices orderDetailServices) {
        this.orderDetailServices = orderDetailServices;
    }

    @PostMapping("/add")
    public ResponseEntity<String> addOrderDetail(@RequestBody OrderDetail orderDetail) {
        orderDetailServices.add(orderDetail);
        return ResponseEntity.ok("SUCCESS: Order added successfully !");
    }
}