/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mapofthehashmatique;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
/**
 *
 * @author Naeem Abu-Eideh
 */
public class MapoftheHashmatique {

    public static void main(String[] args) {
        HashMap<String, String> trackList = new HashMap<String, String>();
        //=========
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 4; i++){
            System.out.print("enter the songe title: ");
            String title = input.next();
            System.out.println();
            System.out.print("enter the songe description: ");
            String desc = input.next();
            System.out.println();
            trackList.put(title, desc);
        }
        System.out.println();
        //===========
        System.out.print("enter the song name: ");
        String title = input.next();
        System.out.println();
        try {
            System.out.println("Song name: "+ title + ", and the song description is: " + trackList.get(title));
        } catch (Exception e) {
            System.out.println("this song is not found");
        }
        System.out.println();
        //===========
        Set<String> list = trackList.keySet();
        for(String key : list){
            System.out.println(key + " : " + trackList.get(key));
        }
        
    }
}
