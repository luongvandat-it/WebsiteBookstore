package com.luongvandat.controllers;

import com.luongvandat.services.BookServices;
import com.luongvandat.services.OrderDetailServices;
import com.luongvandat.services.OrderServices;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/orderDetails")
public class OrderDetailController {
    private final OrderDetailServices orderDetailServices;
    private final BookServices bookServices;
    private final OrderServices orderServices;

    public OrderDetailController(OrderDetailServices orderDetailServices, BookServices bookServices, OrderServices orderServices) {
        this.orderDetailServices = orderDetailServices;
        this.bookServices = bookServices;
        this.orderServices = orderServices;
    }

    @PostMapping("/add")
    public ResponseEntity<String> addOrderDetail(@RequestParam("price") double price, @RequestParam("quantity") int quantity, @RequestParam("orderDate") Date orderDate, @RequestParam("bookTitle") String bookTitle) {
        orderDetailServices.saveOrderDetail(price, quantity, "B007", "ORD00001");
        return ResponseEntity.ok("SUCCESS: OrderDetail added successfully !");
    }
}