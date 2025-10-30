/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.baristaassignment;

/**
 *
 * @author Naeem Abu-Eideh
 */
public class BaristaAssignment {

    public static void main(String[] args) {
        Order order1 = new Order();
        Order order2 = new Order();
        Order order3 = new Order();
        Order order4 = new Order();

        Item item1 = new Item("mocha", 4.5);
        Item item2 = new Item("latte", 2.4);
        Item item3 = new Item("drip coffee", 2.5);
        Item item4 = new Item("cappuccino", 5.0);
        //================

        order1.setName("Rami");
        order2.setName("Jimmy");
        order3.setName("Noah");
        order4.setName("Sam");
        //============ 

        System.out.printf("Name: %s\n", order1.getName());
        System.out.printf("Total: %s\n", order1.getTotal());
        System.out.printf("Ready: %s\n", order1.getReady());
        System.out.println("============================");
        //============
        System.out.printf("Rami total order price is : %s\n", order1.getTotal());
        //======================
        System.out.println("============================");
        order2.setItems(item1);
        order2.countTotal();
        System.out.printf("Jimmy total order price is : %s\n", order2.getTotal());
        //====================
        System.out.println("============================");
        order3.setItems(item4);
        order3.countTotal();
        System.out.printf("Name: %s\n", order3.getName());
        System.out.printf("Total: %s\n", order3.getTotal());
        System.out.printf("Items: %s\n", order3.getItems());
        //=================
        System.out.println("============================");
        order4.setItems(item2);
        order4.countTotal();
        System.out.printf("Name: %s\n", order4.getName());
        System.out.printf("Total: %s\n", order4.getTotal());
        System.out.printf("Items: %s\n", order4.getItems());
        //============
        System.out.println("============================");
        order1.setReady(true);
        System.out.printf("Rami's " + order1.getStatusMessage());
        //==========
        System.out.println("============================");
        order4.setItems(item2);
        order4.setItems(item2);
        order4.countTotal();
        System.out.printf("Name: %s\n", order4.getName());
        System.out.printf("Total: %s\n", order4.getTotal());
        System.out.printf("Items: %s\n", order4.getItems());
        //============
        System.out.println("============================");
        order2.setReady(true);
        System.out.printf("Jimmy " + order2.getStatusMessage());
    }
}
