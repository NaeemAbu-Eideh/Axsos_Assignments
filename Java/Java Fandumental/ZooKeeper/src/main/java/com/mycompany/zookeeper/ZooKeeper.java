/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.zookeeper;

/**
 *
 * @author Naeem Abu-Eideh
 */
public class ZooKeeper {

    public static void main(String[] args) {
        Gorilla gorilla = new Gorilla("koko", 70);
        Bat bat = new Bat("batman", 200);
        
        System.out.println(gorilla.throwSomething());
        System.out.println(gorilla.throwSomething());
        System.out.println(gorilla.throwSomething());
        
        System.out.println(gorilla.eatBananas());
        System.out.println(gorilla.eatBananas());
        
        gorilla.displayEnargy();
        //======
        System.out.println(bat.attackTown());
        System.out.println(bat.attackTown());
        System.out.println(bat.attackTown());
        
        System.out.println(bat.eatHuman());
        System.out.println(bat.eatHuman());

        
        bat.displayEnargy();
    }
}
