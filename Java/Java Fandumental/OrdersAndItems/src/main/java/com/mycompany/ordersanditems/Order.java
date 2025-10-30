/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ordersanditems;

import java.util.ArrayList;

/**
 *
 * @author Naeem Abu-Eideh
 */
public class Order {
    public String name;
    public double total;
    public boolean ready;
    public ArrayList<Item> items;
    //=====
    public Order(){
        name = "";
        total = 0.0;
        ready = false;
        items = new ArrayList<Item>();
    }
    //==============
    public double findTotal(){
        double sum = 0.0;
        for(int i = 0; i < items.size(); i++){
            sum += items.get(i).price;
        }
        this.total = sum;
        return total;
    }
    
    public String getItems(){
        String text = "[ ";
        for(int i = 0; i < items.size()-1; i++){
            text += "( " + items.get(i).name + ", " + items.get(i).price + " ), ";
        }
        text +=  "( " + items.get(items.size()-1).name + ", " + items.get(items.size()-1).price + " ) ]";
        return text;
    }
}
