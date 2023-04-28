package com.luongvandat.repositories;

import com.luongvandat.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book, String> {
    List<Book> findBooksByBookTitleContainsIgnoreCase(String bookTitle);
}