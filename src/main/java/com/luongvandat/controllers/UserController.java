package com.luongvandat.controllers;

import com.luongvandat.entities.Role;
import com.luongvandat.entities.User_;
import com.luongvandat.services.RoleServices;
import com.luongvandat.services.UserServices;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
//@CrossOrigin(origins = "*")
@CrossOrigin(origins = "http://localhost:3000/",methods = {RequestMethod.GET, RequestMethod.POST})
@RequestMapping("/api/user_s")
public class UserController {
    private final UserServices userServices;
    private final RoleServices roleServices;

    public UserController(UserServices userServices, RoleServices roleServices) {
        this.userServices = userServices;
        this.roleServices = roleServices;
    }

    @PostMapping("/add")
    public ResponseEntity<String> addUser(@RequestBody User_ userDto) {
        if (userServices.findUser_ByUserEmail(userDto.getUserEmail()) != null) {
            return ResponseEntity.ok("ERROR: User with email " + userDto.getUserEmail() + " already exists.");
        }

        User_ user = new User_();
        user.setUserName(userDto.getUserName());
        user.setUserPassword(userDto.getUserPassword());
        user.setUserFirstName(userDto.getUserFirstName());
        user.setUserLastName(userDto.getUserLastName());
        user.setUserPhoneNumber(userDto.getUserPhoneNumber());
        user.setUserEmail(userDto.getUserEmail());
        user.setUserCreatedDate(new Date());
        user.setUserUpdatedDate(new Date());

        Role role = roleServices.findOneById(userDto.getRole().getRoleId());
        user.setRole(role);

        User_ savedUser = userServices.add(user);
        return ResponseEntity.ok("SUCCESS: User with email " + savedUser.getUserEmail() + " has been successfully registered !");
    }

    @GetMapping(value = "/mail")
    public ResponseEntity<String> sendEmail(@RequestParam("email") String email, @RequestParam("text") String text) {
        userServices.sendEmail(email, text);
        return ResponseEntity.ok("SUCCESS: Email has been sent to " + email + " !");
    }
}