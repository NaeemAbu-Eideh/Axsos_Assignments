/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.devices;

/**
 *
 * @author Naeem Abu-Eideh
 */
public class Devices {

    public static void main(String[] args) {
        Phone phone = new Phone(70);
        //=====
        phone.doCalling();
        phone.doCalling();
        phone.doCalling();
        //---
        phone.doPlaying();
        phone.doPlaying();
        //---
        phone.doCharge();
        
    }
}
