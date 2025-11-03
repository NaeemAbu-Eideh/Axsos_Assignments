/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.devices;

/**
 *
 * @author Naeem Abu-Eideh
 */
public class Phone extends Device{ // make Phone supclass from Device class
    public Phone(int btr){ // intitialize the battery life og the phone
        super(btr);
    }
    
    public void doCalling(){
        System.out.println("after doing a call, the phone battery decrease by 5 and  be: " + takeBattery(5));
    }
    
    public void doPlaying(){
        System.out.println("after playing a game, the phone battery decrease by 5 and  be: " + takeBattery(20));
    }
    
    public void doCharge(){
        System.out.println("after charging, the phone battery increase by 50 and  be: " + addBattery(50));
    }
}
