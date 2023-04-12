package com.luongvandat.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
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
}