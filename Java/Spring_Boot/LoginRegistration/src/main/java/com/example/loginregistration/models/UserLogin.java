package com.example.loginregistration.models;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class UserLogin {
    @NotBlank(message = UserErrorMessage.NOTNULLMESSAGE)
    @Email(message = UserErrorMessage.EMAILMESSAGE)
    private String email;

    @NotNull(message = UserErrorMessage.NOTNULLMESSAGE)
    @Size(min = 8, message = UserErrorMessage.PASSWORDMESSAGE)
    private String password;

    public UserLogin() {}
    public UserLogin(String email, String password) {
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
