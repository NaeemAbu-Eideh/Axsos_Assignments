package com.example.bookclub.models;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Entity
@Table(name = "books")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = BookErrorMessage.NOTBLANK)
    @Size(min = 1, message = BookErrorMessage.Title)
    private String title;

    @NotBlank(message = BookErrorMessage.NOTBLANK)
    @Size(min = 1, message = BookErrorMessage.Title)
    @Column(name = "author_name")
    private String authorName;

    @NotBlank(message = BookErrorMessage.NOTBLANK)
    @Size(min = 3, message = BookErrorMessage.Description)
    private String thought;

    @Column(updatable=false)
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date createdAt;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date updatedAt;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "author_id")
    private Author author;

    public Book() {}

    public Book(String title, String authorName, String thought) {
        this.title = title;
        this.authorName = authorName;
        this.thought = thought;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setThought(String thought) {
        this.thought = thought;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getThought() {
        return thought;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    @PrePersist
    protected void onCreate(){
        this.createdAt = new Date();
    }
    @PreUpdate
    protected void onUpdate(){
        this.updatedAt = new Date();
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
}
