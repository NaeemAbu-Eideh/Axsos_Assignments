/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.zookeeper;

/**
 *
 * @author Naeem Abu-Eideh
 */
public class Mammal {
    private String animalName;
    private int enargy;
    public Mammal(String name, int enargy){ // to inetialize the data in the class
        setAnimalName(name);
        setEnargy(enargy);
    }
    
    public void setAnimalName(String name){ // to insert data into animal name
        animalName = name;
    }
    public String getAnimalName(){ // get the animal name value
        return animalName;
    }
    public void setEnargy(int enargy){ // to insert data into animal enargy
        this.enargy = enargy;
    }
    public int getEnargy(){ // get the animal enargy value
        return enargy;
    }
    public int displayEnargy(){ // display the enargy of the animal and return it
        System.out.println(getEnargy());
        return getEnargy();
    } 
}
