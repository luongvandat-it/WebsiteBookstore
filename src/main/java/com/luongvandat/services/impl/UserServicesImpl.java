package com.luongvandat.services.impl;

import com.luongvandat.entities.User_;
import com.luongvandat.repositories.UserRepository;
import com.luongvandat.services.UserServices;
import org.springframework.stereotype.Service;

@Service
public class UserServicesImpl implements UserServices {
    private final UserRepository userRepository;

    public UserServicesImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User_ findOneById(String id) {
        return userRepository.findById(id).orElse(null);
    }

    @Override
    public User_ add(User_ user_) {
        return userRepository.save(user_);
    }

    @Override
    public User_ deleteById(String id) {
        User_ user_ = findOneById(id);
        userRepository.deleteById(id);
        return user_;
    }

    @Override
    public User_ update(User_ user_) {
        return userRepository.save(user_);
    }

    @Override
    public User_ findUser_ByUserEmail(String email) {
        return userRepository.findUser_ByUserEmail(email);
    }
}