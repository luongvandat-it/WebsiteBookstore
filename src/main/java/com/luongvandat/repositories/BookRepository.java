package com.luongvandat.repositories;

import com.luongvandat.entities.Book;
import jakarta.annotation.Nullable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Repository
@CrossOrigin(origins = "http://localhost:3000/",methods = {RequestMethod.GET, RequestMethod.PUT, RequestMethod.POST})
public interface BookRepository extends JpaRepository<Book, String> {
//    List<Book> findBooksByBookTitleContainsIgnoreCase(String bookTitle);

    List<Book> findBooksByBookIdBetween(String low, String high);

    Book findBookByBookTitleIgnoreCase(String bookTitle);

    Page<Book> findBooksByBookTitleContainsIgnoreCase(String bookTitle, Pageable pageable);

    Page<Book> findBooksByBookTitleContainsIgnoreCaseAndAuthorAuthorIdContains(String bookTitle, String author, Pageable pageable);

    Page<Book> findByAuthorAuthorIdContains(String author, Pageable pageable);

    Page<Book> findByCategoryCategoryIdAndAuthorAuthorIdContains(String category, String author, Pageable pageable);

}