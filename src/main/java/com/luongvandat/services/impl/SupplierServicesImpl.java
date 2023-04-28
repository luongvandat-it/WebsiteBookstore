package com.luongvandat.services.impl;

import com.luongvandat.repositories.SupplierRepository;
import com.luongvandat.services.SupplierServices;
import org.springframework.stereotype.Service;

@Service
public class SupplierServicesImpl implements SupplierServices {
    private SupplierRepository supplierRepository;

    public SupplierServicesImpl(SupplierRepository supplierRepository) {
        this.supplierRepository = supplierRepository;
    }
}