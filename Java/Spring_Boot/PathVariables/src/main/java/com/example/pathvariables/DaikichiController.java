package com.example.pathvariables;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/daikichi")
public class DaikichiController {

    @RequestMapping("/travel/{city}") // use variables inside the Path route, this method take the String variable named city and print it with text
    public String travel(@PathVariable("city") String city){
        return "Congratulations! You will soon travel to " + city + "!";
    }

    @RequestMapping("/lotto/{number}") // use variables inside the Path route, this method take the integer variable named number and check if it even or odd
    public String lotto(@PathVariable("number") int number){
        if(number % 2 == 0){ // if number is even
            return "ou will take a grand journey in the near future but be wary of tempting offers.";
        }
        else{ // if number is odd
            return "'You have enjoyed the fruits of your labor, but now is a great time to spend time with family and friends.";
        }
    }
}
