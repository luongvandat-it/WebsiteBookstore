package com.luongvandat.repositories;

import com.luongvandat.entities.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMethod;

@Repository
@CrossOrigin(origins = "*")
public interface CommentRepository extends JpaRepository<Comment, String> {
}