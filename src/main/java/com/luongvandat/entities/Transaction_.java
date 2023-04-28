package com.luongvandat.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class Transaction_ {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String transactionId;
    private String transactionType;
    @ManyToOne
    private Order_ order_;

    public Transaction_(String transactionType, Order_ order_) {
        this.transactionType = transactionType;
        this.order_ = order_;
    }
}
