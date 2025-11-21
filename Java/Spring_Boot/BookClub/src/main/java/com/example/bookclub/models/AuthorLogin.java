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
    public String getEmailLogin() {
        return emailLogin;
    }
    public void setEmailLogin(String email) {
        this.emailLogin = email;
    }
    public String getPasswordLogin() {
        return passwordLogin;
    }
    public void setPasswordLogin(String password) {
        this.passwordLogin = password;
    }

}
