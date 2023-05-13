package com.luongvandat.controllers;

import com.luongvandat.services.BookServices;
import com.luongvandat.services.OrderDetailServices;
import com.luongvandat.services.OrderServices;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/_orderDetails")
public class OrderDetailController {
    private final OrderDetailServices orderDetailServices;
    private final BookServices bookServices;
    private final OrderServices orderServices;

    public OrderDetailController(OrderDetailServices orderDetailServices, BookServices bookServices, OrderServices orderServices) {
        this.orderDetailServices = orderDetailServices;
        this.bookServices = bookServices;
        this.orderServices = orderServices;
    }

    @GetMapping("/add")
    public ResponseEntity<String> add(@RequestParam("price") double price, @RequestParam("quantity") int quantity, @RequestParam("orderId") String orderId, @RequestParam("bookId") String bookId) {
        orderDetailServices.saveOrderDetail(price, quantity, orderId, bookId);
        return ResponseEntity.ok("Add order detail successfully!");
    }
}