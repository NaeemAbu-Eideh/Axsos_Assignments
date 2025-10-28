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
        String custom1 = "Ahmad";
        String custom2 = "Sali";
        String custom3 = "Adam";
        double coffee = 10;
        double latte = 15;
        double cappuccino = 13;
        
        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = true;
        boolean isReadyOrder3 = true;
        
        boolean isReady = true;
        
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";
        
        boolean custom1Flag = false;
        boolean custom2Flag = true;
        boolean custom3Flag = true;
        // =============
        System.out.print("Sali orederd coffie, the status is: ");
        System.out.print(custom2Flag);
        System.out.println();
        //=============
        
        System.out.print("Ahmad ordered a cappuccino ");
        if ( custom1Flag){
            System.out.print("status is ");
            System.out.print(custom2Flag);
        }
        System.out.printf("the price is ");
        System.out.print(cappuccino);
        System.out.println();
        // =======================
        System.out.print("Sali just ordered 2 lattes, ");
        System.out.print("total is ");
        System.out.print(2*latte);
        System.out.print(", ");
        if(custom2Flag){
            System.out.print(custom2Flag);
        }
        System.out.println("");
        isReady = false;
        //======================
        System.out.print("Adam just realized he was charged for a coffee but had ordered a latte, the deffirent is: ");
        System.out.print(latte - coffee);
        System.out.println();
        //======================
        coffee = 12;
        latte = 20;
        cappuccino = 12;
        isReady = true;
    }
}
