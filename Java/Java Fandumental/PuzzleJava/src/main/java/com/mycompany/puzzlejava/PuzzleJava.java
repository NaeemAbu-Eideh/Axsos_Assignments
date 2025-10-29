/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.puzzlejava;

import java.util.Random;
import java.util.ArrayList;

/**
 *
 * @author Naeem Abu-Eideh
 */
public class PuzzleJava {

    ArrayList<Integer> getTenRolls() {
        Random rand = new Random();

        ArrayList<Integer> arr = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            int num = rand.nextInt(1, 20);
            arr.add(num);
        }
        return arr;
    }

    //==============
    char generatePassword() {
        String chars = "abcdefghijklmnopqrstuvwxyz";
        Random rand = new Random();
        char letter = chars.charAt(rand.nextInt(25));
        return letter;
    }

    //==============
    ArrayList<String> getNewPasswordSet(int length) {
        ArrayList<String> arr = new ArrayList<String>();
        Random rand = new Random();
        for (int i = 0; i < length; i++) {
            String pass = "";
            for (int j = 0; j < 8; j++) {
                char letter = generatePassword();
                pass += letter;
            }
            arr.add(pass);
        }
        return arr;
    }

    public static void main(String[] args) {
        PuzzleJava generator = new PuzzleJava();
        ArrayList<Integer> randomRolls = generator.getTenRolls();
        System.out.println(randomRolls);
        //========
        ArrayList<Integer> randomRolls1 = generator.getTenRolls();
        System.out.println(randomRolls1);
        //================
        char ch = generator.generatePassword();
        System.out.println(ch);
        //=============
        ArrayList<String> passwords = generator.getNewPasswordSet(4);
        System.out.println(passwords);
        
    }
}
