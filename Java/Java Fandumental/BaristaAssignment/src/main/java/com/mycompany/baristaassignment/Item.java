/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.baristaassignment;

/**
 *
 * @author Naeem Abu-Eideh
 */
public class Item {
    private String name;
    private double price;
    //==========
    public Item(){
      name = "";
      price = 0.0;
    }
    public Item(String name, double price){
      this.name = name;
      this.price = price;
    }
    //=========
    public void setName(String name){
        this.name = name;
    }
    
    public String getName(){
        return name;
    }
    
    public void setPrice(double price){
        this.price = price;
    }
    
    public double getPrice(){
        return price;
    }
}
