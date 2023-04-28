package com.luongvandat.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.Set;

@Data
@NoArgsConstructor
@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String bookId;
    private double bookPrice;
    private String bookTitle;
    private int bookDiscount;
    private String bookDescription;
    private String bookSize;
    private String bookTranslator;
    private double bookWeight;
    private String bookType;
    private String bookLanguage;
    private int bookQuantity;
    private String bookStatus;
    private String bookSlug;
    private Date bookCreatedDate;
    private Date bookUpdatedDate;
    @OneToMany(mappedBy = "book")
    private Set<BookImage> bookImages;
    @ManyToOne
    private Category category;
    @ManyToOne
    private Publisher publisher;
    @ManyToOne
    private Author author;
    @ManyToOne
    private Supplier supplier;
    @OneToMany(mappedBy = "book")
    private Set<Comment> comments;
    @OneToMany(mappedBy = "book")
    private Set<OrderDetail> orderDetails;

    public Book(double bookPrice, String bookTitle, int bookDiscount, String bookDescription, String bookSize, String bookTranslator, double bookWeight, String bookType, String bookLanguage, int bookQuantity, String bookStatus, String bookSlug, Date bookCreatedDate, Date bookUpdatedDate, Set<BookImage> bookImages, Category category, Publisher publisher, Author author, Supplier supplier, Set<Comment> comments, Set<OrderDetail> orderDetails) {
        this.bookPrice = bookPrice;
        this.bookTitle = bookTitle;
        this.bookDiscount = bookDiscount;
        this.bookDescription = bookDescription;
        this.bookSize = bookSize;
        this.bookTranslator = bookTranslator;
        this.bookWeight = bookWeight;
        this.bookType = bookType;
        this.bookLanguage = bookLanguage;
        this.bookQuantity = bookQuantity;
        this.bookStatus = bookStatus;
        this.bookSlug = bookSlug;
        this.bookCreatedDate = bookCreatedDate;
        this.bookUpdatedDate = bookUpdatedDate;
        this.bookImages = bookImages;
        this.category = category;
        this.publisher = publisher;
        this.author = author;
        this.supplier = supplier;
        this.comments = comments;
        this.orderDetails = orderDetails;
    }
}