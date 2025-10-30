/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.baristaassignment;

import java.util.ArrayList;

/**
 *
 * @author Naeem Abu-Eideh
 */
public class Order {

    private String name;
    private double total;
    private boolean ready;
    private ArrayList<Item> items;

    //=====
    public Order() {
        name = "";
        total = 0.0;
        ready = false;
        items = new ArrayList<Item>();
    }

    //==============
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void countTotal() {
        double sum = 0.0;
        for (int i = 0; i < items.size(); i++) {
            sum += items.get(i).getPrice();
        }
        this.total = sum;
    }

    public double getTotal() {
        return total;
    }

    public void setReady(boolean ready) {
        this.ready = ready;
    }

    public boolean getReady() {
        return ready;
    }

    public String getItems() {
        String text = "[ ";
        for (int i = 0; i < items.size() - 1; i++) {
            text += "( " + items.get(i).getName() + ", " + items.get(i).getPrice() + " ), ";
        }
        text += "( " + items.get(items.size() - 1).getName() + ", " + items.get(items.size() - 1).getPrice() + " ) ]";
        return text;
    }

    public void setItems(Item item) {
        this.items.add(item);
    }

    public String getStatusMessage() {
        String text = "order is "; 
        if(ready == true){
            text += "ready.";
        }
        else{
            text += "not ready.";
        }
        return text;
    }
}
