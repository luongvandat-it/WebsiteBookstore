package com.luongvandat.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Supplier {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String supplierId;
    private String supplierName;
    @OneToMany(mappedBy = "supplier")
    private Set<Book> books;

    public Supplier(String supplierName) {
        setSupplierName(supplierName);
    }
}