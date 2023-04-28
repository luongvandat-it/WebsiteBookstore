package com.luongvandat.services;

import com.luongvandat.entities.Supplier;

public interface SupplierServices {
    Supplier findOneById(String id);

    Supplier add(Supplier supplier);

    Supplier deleteById(String id);

    Supplier update(Supplier supplier);
}