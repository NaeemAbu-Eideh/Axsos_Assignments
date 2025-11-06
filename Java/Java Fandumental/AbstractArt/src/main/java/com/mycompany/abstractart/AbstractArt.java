/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.abstractart;

/**
 *
 * @author Naeem Abu-Eideh
 */
public class AbstractArt {

    public static void main(String[] args) {
        Painting paint1 = new Painting("paint1", "vv", "vv", "vvvvvv");
        Painting paint2 = new Painting("paint2", "vv", "vv", "vvvvvv");
        Painting paint3 = new Painting("paint3", "vv", "vv", "vvvvvv");
        
        Sculpture sculp1 = new Sculpture("sculp1", "vv", "vv", "vvggggg");
        Sculpture sculp2 = new Sculpture("sculp2", "vv", "vv", "vvggggg");
        //
        System.out.println(paint1.viewArt()+ ", " + paint1.getAuthor() + ", " + paint1.getTitle() + ", " + paint1.getDescription());
        System.out.println(paint2.viewArt()+ ", " + paint2.getAuthor() + ", " + paint2.getTitle() + ", " + paint2.getDescription());
        System.out.println(paint3.viewArt()+ ", " + paint3.getAuthor() + ", " + paint3.getTitle() + ", " + paint3.getDescription());
        
        System.out.println(sculp1.viewArt() + ", " + sculp1.getAuthor() + ", " + sculp1.getTitle() + ", " + sculp1.getDescription());
        System.out.println(sculp2.viewArt() + ", " + sculp2.getAuthor() + ", " + sculp2.getTitle() + ", " + sculp2.getDescription());
    }
}
