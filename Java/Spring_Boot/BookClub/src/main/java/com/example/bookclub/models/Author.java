package com.example.bookclub.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "authors")
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = AuthorErrorMessage.NOTBLANK)
    @Size(min = 3, max = 50, message = AuthorErrorMessage.NAMESIZE)
    private String name;


    @NotBlank(message = AuthorErrorMessage.NOTBLANK)
    @Email(message = AuthorErrorMessage.EMAIL)
    @Column(unique = true, nullable = false)
    private String email;

    @NotBlank(message = AuthorErrorMessage.NOTBLANK)
    @Size(min = 8, message = AuthorErrorMessage.PASSWOED)
    private String password;

    @Transient
    @NotBlank(message = AuthorErrorMessage.NOTBLANK)
    @Size(min = 8, message = AuthorErrorMessage.PASSWOED)
    private String confirmPassword;

    @Column(updatable=false)
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date createdAt;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date updatedAt;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "author", fetch = FetchType.LAZY)
    private List<Book> books;

    @PrePersist
    protected void onCreate(){
        this.createdAt = new Date();
    }
    @PreUpdate
    protected void onUpdate(){
        this.updatedAt = new Date();
    }


    public Author() {}

    public Author(String name, String email, String password, String confirmPassword) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.confirmPassword = confirmPassword;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
}
