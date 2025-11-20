package com.example.bookclub.models;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class AuthorLogin {
    @NotBlank(message = AuthorErrorMessage.NOTBLANK)
    @Email(message = AuthorErrorMessage.EMAIL)
    private String email;

    @NotBlank(message = AuthorErrorMessage.NOTBLANK)
    @Size(min = 8, message = AuthorErrorMessage.PASSWOED)
    private String password;

    public AuthorLogin() {}

    public AuthorLogin(String email, String password) {
        this.email = email;
        this.password = password;
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

}
