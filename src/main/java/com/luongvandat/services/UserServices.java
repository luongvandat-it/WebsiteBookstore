package com.luongvandat.services;

import com.luongvandat.entities.User_;

public interface UserServices {
    User_ findOneById(String id);

    User_ add(User_ user_);

    User_ deleteById(String id);

    User_ update(User_ user_);

    User_ findUser_ByUserEmail(String email);
}