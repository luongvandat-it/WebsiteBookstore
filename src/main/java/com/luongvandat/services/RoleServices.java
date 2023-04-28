package com.luongvandat.services;

import com.luongvandat.entities.Role;

public interface RoleServices {
    Role findOneById(String id);

    Role add(Role role);

    Role deleteById(String id);

    Role update(Role role);
}