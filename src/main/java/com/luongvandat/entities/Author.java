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
}