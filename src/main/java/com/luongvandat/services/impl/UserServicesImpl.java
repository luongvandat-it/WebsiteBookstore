package com.luongvandat.services.impl;

import com.luongvandat.repositories.UserRepository;
import com.luongvandat.services.UserServices;
import org.springframework.stereotype.Service;

@Service
public class UserServicesImpl implements UserServices {
    private UserRepository userRepository;

    public UserServicesImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
}