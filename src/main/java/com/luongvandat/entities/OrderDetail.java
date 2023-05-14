package com.luongvandat.entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@Entity
public class OrderDetail {
    @EmbeddedId
    private OrderDetailId orderDetailId;

    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @ManyToOne
    @MapsId("orderId")
    private Order_ order_;

    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @ManyToOne
    @MapsId("bookId")
    private Book book;
    private int quantity;
    private double price;
}