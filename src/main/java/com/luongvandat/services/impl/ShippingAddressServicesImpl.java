package com.luongvandat.services.impl;

import com.luongvandat.repositories.ShippingAddressRepository;
import com.luongvandat.services.ShippingAddressServices;
import org.springframework.stereotype.Service;

@Service
public class ShippingAddressServicesImpl implements ShippingAddressServices {
    private ShippingAddressRepository shippingAddressRepository;

    public ShippingAddressServicesImpl(ShippingAddressRepository shippingAddressRepository) {
        this.shippingAddressRepository = shippingAddressRepository;
    }
}