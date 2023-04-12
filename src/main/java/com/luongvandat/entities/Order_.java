package com.luongvandat.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Order_ {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String orderId;
    private Date orderDate;
    private String orderNote;
    private String orderDiscount;
    private String orderStatus;
    @ManyToOne
    private User_ user_;
    @OneToMany(mappedBy = "order_")
    private Set<Transaction_> transactions;
    @OneToMany(mappedBy = "order_")
    private Set<OrderDetail> orderDetails;
}