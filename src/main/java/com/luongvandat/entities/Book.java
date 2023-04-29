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
}