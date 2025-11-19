package com.example.productsandcategories.models;

public interface ProductMessage {
    public static final String NOTBLANK = "this field cannot be blank";
    public static final String NAME = "name size must be greater than 2";
    public static final String DESCRIPTION = "description size must be greater than 2";
    public static final String PRICE = "price must be at least 0.00";
}
