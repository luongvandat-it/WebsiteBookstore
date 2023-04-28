package com.luongvandat.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.Set;

@Data
@NoArgsConstructor
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

    public Order_(Date orderDate, String orderNote, String orderDiscount, String orderStatus, User_ user_, Set<Transaction_> transactions, Set<OrderDetail> orderDetails) {
        this.orderDate = orderDate;
        this.orderNote = orderNote;
        this.orderDiscount = orderDiscount;
        this.orderStatus = orderStatus;
        this.user_ = user_;
        this.transactions = transactions;
        this.orderDetails = orderDetails;
    }
}