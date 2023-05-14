package com.luongvandat.repositories;

import com.luongvandat.entities.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMethod;

@Repository
@CrossOrigin(origins = "http://localhost:3000/",methods = {RequestMethod.GET, RequestMethod.POST})
public interface AuthorRepository extends JpaRepository<Author, String> {
}