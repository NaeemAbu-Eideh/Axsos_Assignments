/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java_cafe;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Naeem Abu-Eideh
 */
public class CafeUtil {
    int getStreakGoal(int num){
        if (num >= 10){
            return -1;
        }
        if (num == 10){
            return 10;
        }
        int sum = 0;
        for(int i = num; i < 10; i++){
            sum += i;
        }
        return sum;
    }
    
    int getStreakGoal(){
        int sum = 0;
        for (int i = 0; i < 10; i++){
            sum += i;
        }
        return sum;
    }
    //======================================
    double getOrderTotal(double[] prices){
        double sum = 0.0;
        for (int i = 0; i < prices.length; i++){
            sum += prices[i];
        }
        return sum;
    }
    //======================================
    void displayMenu(ArrayList<String> menuItems){
        for (int i = 0; i < menuItems.size(); i++){
            System.out.print(i);
            System.out.println(" " + menuItems.get(i));
        }
    }
    //======================================
    void addCustomer(ArrayList<String> customers){
         System.out.println("Enter your name please");
         //String username = System.console().readLine();
         Scanner input = new Scanner(System.in);
         System.out.print("enter your name: ");
         String username = input.next();
         System.out.println();
         
         System.out.println("Hello " + username);
         System.out.print("There are ");
         System.out.print( customers.size());
         System.out.println(" people in front of you");
         customers.add(username);
         System.out.print("[ ");
         int i;
         for (i = 0; i < customers.size()-1; i++){
             System.out.print(customers.get(i) + ", ");
         }
         System.out.println(customers.get(i) + " ]");
         
         
    }
}
