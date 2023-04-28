package com.luongvandat.services.impl;

import com.luongvandat.repositories.RoleRepository;
import com.luongvandat.services.RoleServices;
import org.springframework.stereotype.Service;

@Service
public class RoleServicesImpl implements RoleServices {
    private RoleRepository roleRepository;

    public RoleServicesImpl(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }
}