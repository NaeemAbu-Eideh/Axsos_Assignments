/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.abstractart;

/**
 *
 * @author Naeem Abu-Eideh
 */
public class Painting extends Art {
    private String paintType;
    // constructer for Painting class
    public Painting(String paintType ,String title, String author, String desc){
        super(title, author, desc);
        this.paintType = paintType;
    }
    
    // override and rebuild the function viewArt that come from abstract class named Art
    @Override
    public String viewArt() {
        return "the paintType is " + getPaintType();
    }

    //setters and getters for Painting class member variabels
    public String getPaintType() {
        return paintType;
    }

    public void setPaintType(String paintType) {
        this.paintType = paintType;
    }
    
     
    
}
