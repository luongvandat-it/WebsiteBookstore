package com.luongvandat.services.impl;

import com.luongvandat.entities.Supplier;
import com.luongvandat.repositories.SupplierRepository;
import com.luongvandat.services.SupplierServices;
import org.springframework.stereotype.Service;

@Service
public class SupplierServicesImpl implements SupplierServices {
    private final SupplierRepository supplierRepository;

    public SupplierServicesImpl(SupplierRepository supplierRepository) {
        this.supplierRepository = supplierRepository;
    }

    @Override
    public Supplier findOneById(String id) {
        return supplierRepository.findById(id).orElse(null);
    }

    @Override
    public Supplier add(Supplier supplier) {
        return supplierRepository.save(supplier);
    }

    @Override
    public Supplier deleteById(String id) {
        Supplier supplier = findOneById(id);
        supplierRepository.deleteById(id);
        return supplier;
    }

    @Override
    public Supplier update(Supplier supplier) {
        return supplierRepository.save(supplier);
    }
}