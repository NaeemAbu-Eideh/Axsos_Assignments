/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cafeapp;

import java.lang.reflect.GenericArrayType;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Naeem Abu-Eideh
 */
public class CoffeeKiosk {

    private ArrayList<Item> menu;
    private ArrayList<Order> orders;

    public CoffeeKiosk() { // this constrector to inetialize the Arraylists menu and orders , and store it in memory to used it
        menu = new ArrayList<Item>();
        orders = new ArrayList<Order>();
    }

    public void setMenu(Item item) { // this method is setter method to add new item to the menu list
        menu.add(item);
    }

    public ArrayList<Item> getMenu() { // this method is getter method to get the menu list 
        return menu;
    }

    public void setOrders(Order order) { // this method is setter method to add new order to the orders list
        orders.add(order);
    }

    public ArrayList<Order> getOrders() { // this method is getter method to get the orders list
        return orders;
    }

    public void addMenuItem(String name, double price) { // this method to create a new item and insert name and price to it, then add it to menu list
        Item item = new Item(name, price);
        setMenu(item);
    }

    public void displayMenu() { // display all items in menu into cmd , it display the index of the item in the list , item name, and item price
        for (int i = 0; i < menu.size(); i++) {
            System.out.println("" + i + " " + menu.get(i).getName() + " -- " + menu.get(i).getPrice());
        }
    }

    public void newOrder() { // in this method, the user input his name, and chose an items from menu , then it display the bill
        Scanner input = new Scanner(System.in);
        System.out.print("please enter your name: ");
        String name = input.next();
        System.out.println();
        //----
        displayMenu();
        ArrayList<String> indeces = new ArrayList<String>();
        System.out.println("enter a number of the item, or q for exit: ");
        String str = input.next();
        System.out.println();
        while (!str.equalsIgnoreCase("q")) {
            indeces.add(str);
            str = input.next();
        }
        System.out.println("Thank you, " + name + ". Here are your order details: ");
        System.out.println("Customer Name: " + name);
        double totalPrice = 0.0;
        for(int i = 0; i < indeces.size(); i++){
            int index = Integer.parseInt(indeces.get(i));
            System.out.println("" + menu.get(index).getName() + " - " + menu.get(index).getPrice());
            totalPrice += menu.get(index).getPrice();
        }
        System.out.println("Total: " + totalPrice);
    }
    
    
}
