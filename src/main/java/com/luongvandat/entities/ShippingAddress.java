package com.luongvandat.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
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

    public ShippingAddress(String shippingAddressFullNameOfReceiver, String shippingAddressPhoneNumber, String shippingAddressStreetAndHouseNumber, String shippingAddressDistrict, String shippingAddressWard, String shippingAddressCity, User_ user_) {
        this.shippingAddressFullNameOfReceiver = shippingAddressFullNameOfReceiver;
        this.shippingAddressPhoneNumber = shippingAddressPhoneNumber;
        this.shippingAddressStreetAndHouseNumber = shippingAddressStreetAndHouseNumber;
        this.shippingAddressDistrict = shippingAddressDistrict;
        this.shippingAddressWard = shippingAddressWard;
        this.shippingAddressCity = shippingAddressCity;
        this.user_ = user_;
    }
}