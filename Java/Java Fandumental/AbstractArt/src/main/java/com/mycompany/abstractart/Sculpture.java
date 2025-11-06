/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.abstractart;

/**
 *
 * @author Naeem Abu-Eideh
 */
public class Sculpture extends Art {

    private String material;
    
    // constructer for the class Sculpture
    public Sculpture(String material, String title, String author, String desc){
        super(title, author, desc);
        this.material = material;
    }
    
    // override and rebuild the function viewArt that come from abstract class named Art
    @Override
    public String viewArt() {
        return "the material is: " + getMaterial();
    }

    // setters and getters for the Sculpture class
    public void setMaterial(String material) {
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }
    
}
