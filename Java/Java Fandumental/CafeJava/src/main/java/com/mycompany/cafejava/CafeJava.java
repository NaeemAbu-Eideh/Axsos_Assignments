/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.cafejava;

/**
 *
 * @author Naeem Abu-Eideh
 */
public class CafeJava {

    public static void main(String[] args) {
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";

        double dripCoffeePrice = 2.5;
        double lattePrice = 4.0;
        double cappuccinoPrice = 3.5;

        String customer2 = "Ahmad";
        String customer3 = "Sali";
        String customer4 = "Adam";

        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = true;
        boolean isReadyOrder3 = false;

        //================
        System.out.println("\n--- Sali's Order ---");
        System.out.println(generalGreeting + customer3);
        if (isReadyOrder3) {
            System.out.println(customer3 + readyMessage);
            System.out.println(displayTotalMessage + dripCoffeePrice);
        } else {
            System.out.println(customer3 + pendingMessage);
        }

        //===============
        System.out.println("\n--- Ahmad's Order ---");
        if (isReadyOrder2) {
            System.out.println(customer2 + readyMessage);
            System.out.println(displayTotalMessage + cappuccinoPrice);
        } else {
            System.out.println(customer2 + pendingMessage);
        }
        //==============
        System.out.println("\n--- Sali's New Order (2 Lattes) ---");
        double saliTotal = lattePrice * 2;
        System.out.println(displayTotalMessage + saliTotal);
        if (isReadyOrder3) {
            System.out.println(customer3 + readyMessage);
        } else {
            System.out.println(customer3 + pendingMessage);
        }
        //==============
        System.out.println("\n--- Adam's Order Correction ---");
        double adamOwes = lattePrice - dripCoffeePrice;
        System.out.println(customer4 + ", you were charged for coffee but ordered a latte.");
        System.out.println("You owe an additional $" + adamOwes);
    }
}
