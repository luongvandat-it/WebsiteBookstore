package com.luongvandat.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@NoArgsConstructor
@Entity
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String categoryId;
    private String categoryName;
    @OneToMany(mappedBy = "category")
    private Set<Book> books;

    public Category(String categoryName) {
        setCategoryName(categoryName);
    }

    public Category(String categoryName, Set<Book> books) {
        this.categoryName = categoryName;
        this.books = books;
    }
}