package com.luongvandat.entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class Comment {
    @EmbeddedId
    private CommentId commentId = new CommentId();
    @ManyToOne
    @MapsId("userId")
    private User_ user_;
    @ManyToOne
    @MapsId("bookId")
    private Book book;
    private String commentContent;
    private String commentDate;
    private String commentRating;

    public Comment(User_ user_, Book book, String commentContent, String commentDate, String commentRating) {
        this.user_ = user_;
        this.book = book;
        this.commentContent = commentContent;
        this.commentDate = commentDate;
        this.commentRating = commentRating;
    }
}
