package com.example.routers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greeting")
public class HomeControllers { // this class for controllers that it contains methods that used for ResController
    @RequestMapping("")
    public String index(){ // this method for return the URL for the server if I used the Root: /greeting
        return "This is accessed view http://your_server/simple/root";
    }
    @RequestMapping("/hello")
    // this method for return a text started with Hello World for the server if I used the Root: /greeting/hello
    public String hello(){
        return "Hello world! What route did you use to access me?";
    }
    @RequestMapping("/goodbye")
    public String world(){// this method for return a text started with Goodbye World for the server if I used the Root: /greeting/goodbye
        return "Goodbye world!";
    }
}
