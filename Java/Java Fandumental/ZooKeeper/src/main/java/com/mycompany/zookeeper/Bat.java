/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.zookeeper;

/**
 *
 * @author Naeem Abu-Eideh
 */
public class Bat extends Mammal { // make class Bat sup-class from Mammal class

    public Bat(String name, int enargy) {
        super(name, enargy);// to set the name and enargy about the bat inside the constructer
    }

    public String fly() { // decrease the bat enargy by 50 because it fly
        if (getEnargy() == 0) {
            return "the bat is verry sad";
        }
        setEnargy(getEnargy() - 50);
        if (getEnargy() <= 0) {
            setEnargy(0);
        }
        return "the bat name: " + getAnimalName() + " it enargy decrease by 50 and be " + getEnargy() + ", because it fly";
    }

    public String eatHuman() { // increase the bat enargy by 25 because it eat human
        if (getEnargy() == 300) {
            return "the bat is verry happy";
        }

        setEnargy(getEnargy() + 25);
        String text = "the bat name: " + getAnimalName() + " it enargy increase by 25 and be " + getEnargy() + ", ";
        if (getEnargy() >= 300) {
            setEnargy(300);
            text += "the bat is verry happy";
        }
        return text;
    }
    public String attackTown(){ // decrase the bat enargy by 100 because it eat human
        if (getEnargy() == 0) {
            return "the bat is verry sad";
        }
        setEnargy(getEnargy() - 100);
        if (getEnargy() <= 0) {
            setEnargy(0);
        }
        return "the bat name: " + getAnimalName() + " it enargy decrease by 100 and be " + getEnargy() + ", because it attack a town";
    }
    
    @Override
    public int displayEnargy(){ // display the enargy of the bat and return it (override)
        System.out.println("bat name: " + getAnimalName() + ", the enargy is: " + getEnargy());
        return getEnargy();
    }
}
