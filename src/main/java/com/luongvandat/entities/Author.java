package com.luongvandat.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@NoArgsConstructor
@Entity
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String authorId;
    private String authorName;
    @OneToMany(mappedBy = "author")
    private Set<Book> books;

    public Author(String authorName) {
        setAuthorName(authorName);
    }

    public Author(String authorName, Set<Book> books) {
        this.authorName = authorName;
        this.books = books;
    }
}