package com.luongvandat.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@NoArgsConstructor
@Entity
public class Publisher {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String publisherId;
    private String publisherName;
    @OneToMany(mappedBy = "publisher")
    private Set<Book> books;

    public Publisher(String publisherName) {
        setPublisherName(publisherName);
    }

    public Publisher(String publisherName, Set<Book> books) {
        this.publisherName = publisherName;
        this.books = books;
    }
}