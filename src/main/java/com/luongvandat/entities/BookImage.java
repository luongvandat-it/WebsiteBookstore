package com.luongvandat.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class BookImage {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String imageId;
    private String imageName;
    private String imageType;
    private byte[] image;
    @ManyToOne
    private Book book;

    public BookImage(String imageName, String imageType, byte[] image, Book book) {
        this.imageName = imageName;
        this.imageType = imageType;
        this.image = image;
        this.book = book;
    }
}