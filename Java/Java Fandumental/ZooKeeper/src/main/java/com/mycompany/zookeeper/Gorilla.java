/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.zookeeper;

/**
 *
 * @author Naeem Abu-Eideh
 */
public class Gorilla extends Mammal{ // make Gorilla class as sup-class from Manimmal
    public Gorilla(String animalName, int enargy){ // to set the name and enargy about the gorilla inside the constructer 
        super(animalName, enargy);
    }
    public String throwSomething(){ // to decrease the value of gorilla enargy
        setEnargy(getEnargy()-5);
        return "Gorilla name: " + getAnimalName() + " decrase it enargy by 5 , and it be: " + getEnargy() + ", because it throw something";
    }
    
    public String eatBananas(){ // to increase the value of gorrila enargy
        if(getEnargy() == 100){
            return "the gorrila is happy becaus it enargy = 100";
        }
        setEnargy(getEnargy() + 10);
        String text = "Gorilla name: " + getAnimalName() + " increase it enargy by 10 , and it be: " + getEnargy();
        if(getEnargy() >= 100){
            setEnargy(100);
            text += "it is happy";
        }
        return text;
    }
    
    public String climb(){ // to decrease the value of gorilla enargy by 10
        setEnargy(getEnargy()-5);
        return "Gorilla name: " + getAnimalName() + " decrase it enargy by 5 , and it be: " + getEnargy() + ", because it climb on a tree";
    }
    
    @Override
    public int displayEnargy(){ // display the enargy of the gorilla and return it (override)
        System.out.println("Gorila name: " + getAnimalName() + ", the enargy is: " + getEnargy());
        return getEnargy();
    }
}
