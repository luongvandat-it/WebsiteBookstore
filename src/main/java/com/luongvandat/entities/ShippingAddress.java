package com.luongvandat.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class ShippingAddress {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String shippingAddressId;
    private String shippingAddressFullNameOfReceiver;
    private String shippingAddressPhoneNumber;
    private String shippingAddressStreetAndHouseNumber;
    private String shippingAddressDistrict;
    private String shippingAddressWard;
    private String shippingAddressCity;
    @ManyToOne
    private User_ user_;
}