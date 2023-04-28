package com.luongvandat.controllers;

import com.luongvandat.services.SupplierServices;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/suppliers")
public class SupplierController {
    private final SupplierServices supplierServices;

    public SupplierController(SupplierServices supplierServices) {
        this.supplierServices = supplierServices;
    }
}