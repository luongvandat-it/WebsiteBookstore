package com.luongvandat.controllers;

import com.luongvandat.services.ShippingAddressServices;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/shippingAddresses")
public class ShippingAddressController {
    private final ShippingAddressServices shippingAddressServices;

    public ShippingAddressController(ShippingAddressServices shippingAddressServices) {
        this.shippingAddressServices = shippingAddressServices;
    }
}