/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.abstractart;

/**
 *
 * @author Naeem Abu-Eideh
 */
public abstract class Art {
     private String title;
     private String author;
     private String description;

     
    // constructer that run automatecly wen we use the class from subclasses
    public Art(String title, String author, String description) {
        this.title = title;
        this.author = author;
        this.description = description;
    }
     
     
    // Setters and Getters for class member variable
    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getDescription() {
        return description;
    }
     
    //----
    // abstract method named viewArt
    public abstract String viewArt();
     
}
