package com.example.bookclub.models;

public interface AuthorErrorMessage {
    public static final String NOTBLANK = "This field is required";
    public static final String NOTNULL = "This field is not be null";
    public static final String NAMESIZE = "the name size must be between 3 and 50";
    public static final String PASSWOED = "the password must be greater 8";
    public static final String EMAIL= "Email must be valid";
}
