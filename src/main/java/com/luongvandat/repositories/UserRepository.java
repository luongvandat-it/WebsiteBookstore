package com.luongvandat.repositories;

import com.luongvandat.entities.User_;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMethod;

@Repository
@CrossOrigin(origins = "http://localhost:3000/",methods = {RequestMethod.GET, RequestMethod.POST})
public interface UserRepository extends JpaRepository<User_, String> {
    User_ findUser_ByUserEmail(String email);
}