/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.alfrid_bot;
import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;


/**
 *
 * @author Naeem Abu-Eideh
 */
public class AlfredQuotes {

    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "Hello, lovely to see you. How are you?";
    }

    public String guestGreeting(String name) {
//        Scanner input = new Scanner(System.in);
//        System.out.print("enter your first name: ");
//        String fname =  input.next();
//        
//        System.out.println();
//        System.out.print("enter your last name: ");
//        String lname =  input.next();
//        System.out.println();
//        System.out.println("Hello, " + fname + " " + lname + ". Lovely to see you.");
        return "Hello, " + name + ". Lovely to see you.";
    }

    public String dateAnnouncement() {
        Date date = new Date();
        return "it is currently " + date ;
        
    }

    public String respondBeforeAlexis(String conversation) {
        if( conversation.contains("Alexis") ){
            return "Right away, sir. She certainly isn't sophisticated enough for that.";
        }
        
        if ( conversation.contains("Alfred") ){
            return "At your service. As you wish, naturally";
        }
        return "Right. And with that I shall retire.";
        
    }
}
