package com.example.loginregistration.models;

public interface UserErrorMessage {
    public static final String NOTNULLMESSAGE =  "the field must be filled";
    public static final String USERMESSAGE = "the username must be between 3 and 50";
    public static final String EMAILMESSAGE = "the email must be valid";
    public static final String PASSWORDMESSAGE = "the password must be more than 8";
    public static final String CPASSWORDMESSAGE = "the confirmed password must be between 8 and 50";
}
