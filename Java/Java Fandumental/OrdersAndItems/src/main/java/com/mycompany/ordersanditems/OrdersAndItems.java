/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ordersanditems;

/**
 *
 * @author Naeem Abu-Eideh
 */
public class OrdersAndItems {

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

        order1.name = "Rami";
        order2.name = "Jimmy";
        order3.name = "Noah";
        order4.name = "Sam";
        //============ 

        System.out.printf("Name: %s\n", order1.name);
        System.out.printf("Total: %s\n", order1.total);
        System.out.printf("Ready: %s\n", order1.ready);
        System.out.println("============================");
        //============
        System.out.printf("Rami total order price is : %s\n", order1.total);
        //======================
        System.out.println("============================");
        order2.items.add(item1);
        order2.findTotal();
        System.out.printf("Jimmy total order price is : %s\n", order2.total);
        //====================
        System.out.println("============================");
        order3.items.add(item4);
        order3.findTotal();
        System.out.printf("Name: %s\n", order3.name);
        System.out.printf("Total: %s\n", order3.total);
        System.out.printf("Items: %s\n", order3.getItems());
        //=================
        System.out.println("============================");
        order4.items.add(item2);
        order4.findTotal();
        System.out.printf("Name: %s\n", order4.name);
        System.out.printf("Total: %s\n", order4.total);
        System.out.printf("Items: %s\n", order4.getItems());
        //============
        System.out.println("============================");
        order1.ready = true;
        System.out.printf("Rami's order is %s\n", order1.ready == true ? "ready." : "not ready");
        //==========
        System.out.println("============================");
        order4.items.add(item2);
        order4.items.add(item2);
        order4.findTotal();
        System.out.printf("Name: %s\n", order4.name);
        System.out.printf("Total: %s\n", order4.total);
        System.out.printf("Items: %s\n", order4.getItems());
        //============
        System.out.println("============================");
        order2.ready = true;
        System.out.printf("Jimmy's order is %s\n", order2.ready == true ? "ready." : "not ready");
    }
}
