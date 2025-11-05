package com.example.routers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/daikichi")
public class DaikichiController { // this class for controllers that it contains methods that used for ResController
    @RequestMapping("")
    public String index(){ // this method for return Welcome! for the server if I used the Root: /daikichi
        return "Welcome!";
    }
    @RequestMapping("/today")
    // this method for return this text: Today you will find luck in all your endeavors,  for the server if I used the Root: /greeting/hello
    public String hello(){
        return "Today you will find luck in all your endeavors!";
    }
    @RequestMapping("/tomorrow")
    public String world(){// this method return the text: Tomorrow, an opportunity will arise, so be sure to be open to new ideas!,  for the server if I used the Root: /greeting/goodbye
        return "Tomorrow, an opportunity will arise, so be sure to be open to new ideas!";
    }
}
