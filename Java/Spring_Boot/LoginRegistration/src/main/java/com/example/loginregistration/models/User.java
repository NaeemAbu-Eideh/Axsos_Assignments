package com.example.loginregistration.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull(message = UserErrorMessage.NOTNULLMESSAGE)
    @Size(min = 3, max = 50, message = UserErrorMessage.USERMESSAGE)
    private String username;

    @NotBlank(message = UserErrorMessage.NOTNULLMESSAGE)
    @Email(message = UserErrorMessage.EMAILMESSAGE)
    private String email;

    @NotNull(message = UserErrorMessage.NOTNULLMESSAGE)
    @Size(min = 8, message = UserErrorMessage.PASSWORDMESSAGE)
    private String password;

    @Transient
    @NotNull(message = UserErrorMessage.NOTNULLMESSAGE)
    @Size(min = 8, message = UserErrorMessage.CPASSWORDMESSAGE)
    private String confirmPassword;

    @Column(updatable=false)
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date createdAt;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date updatedAt;

    public User() {}
    public User(String username, String email, String password, String confirmPassword) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.confirmPassword = confirmPassword;
    }

    public Long getId() {
        return id;
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
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
}
