package com.luongvandat.controllers;

import com.luongvandat.entities.Role;
import com.luongvandat.entities.User_;
import com.luongvandat.services.UserServices;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/user_s")
public class UserController {
    private final UserServices userServices;

    public UserController(UserServices userServices) {
        this.userServices = userServices;
    }

    @PostMapping("/add")
    public ResponseEntity<User_> addOrUpdate(@RequestBody User_ user_) {
        user_ = new User_();
        userServices.add(user_);
        return new ResponseEntity<User_>(user_, HttpStatus.OK);
    }
}