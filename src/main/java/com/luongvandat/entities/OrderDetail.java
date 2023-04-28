package com.luongvandat.entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class OrderDetail {
    @EmbeddedId
    private OrderDetailId orderDetailId;
    @ManyToOne
    @MapsId("orderId")
    private Order_ order_;
    @ManyToOne
    @MapsId("bookId")
    private Book book;
    private int quantity;
    private double price;

    public OrderDetail(Order_ order_, Book book, int quantity, double price) {
        this.order_ = order_;
        this.book = book;
        this.quantity = quantity;
        this.price = price;
    }
}
