/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.devices;

/**
 *
 * @author Naeem Abu-Eideh
 */
public class Device {

    private int battery;

    public Device(int btr) { // to initialize the data of battary when we create an instence of the Device class
        setBattery(btr);
    }

    public void setBattery(int btr) { // set data into battery 
        battery = btr;
    }

    public int getBattery() { // return the battery value 
        return battery;
    }

    public int addBattery(int btr) { // increase the value of battery
        if(getBattery() < 100 ){
            setBattery(getBattery() + btr);
        }
        if(getBattery() > 100){
            setBattery(100);
        }
        return getBattery();
    }

    public int takeBattery(int btr) {// decrease the value of battery
        if(getBattery() > 0 ){
            setBattery(getBattery() - btr);
        }
        if(getBattery() < 0){
            setBattery(0);
        }
        return getBattery();
    }
}
