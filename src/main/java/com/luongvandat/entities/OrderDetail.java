package com.luongvandat.entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
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
}