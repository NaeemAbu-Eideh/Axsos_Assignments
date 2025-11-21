package com.example.bookclub.models;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class AuthorLogin {
    @NotBlank(message = AuthorErrorMessage.NOTBLANK)
    @Email(message = AuthorErrorMessage.EMAIL)
    private String emailLogin;

    @NotBlank(message = AuthorErrorMessage.NOTBLANK)
    @Size(min = 8, message = AuthorErrorMessage.PASSWOED)
    private String passwordLogin;

    public AuthorLogin() {}

    public AuthorLogin(String email, String password) {
        this.emailLogin = email;
        this.passwordLogin = password;
    }
    public String getEmail() {
        return emailLogin;
    }
    public void setEmail(String email) {
        this.emailLogin = email;
    }
    public String getPassword() {
        return passwordLogin;
    }
    public void setPassword(String password) {
        this.passwordLogin = password;
    }

}
