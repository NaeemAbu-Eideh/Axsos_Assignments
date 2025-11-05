package com.example.hellohuman;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloHumanApplication {

    public static void main(String[] args) {
        SpringApplication.run(HelloHumanApplication.class, args);
    }

    @RequestMapping("/")
    @ResponseBody
    // using RequestPram annotate to apply using ? inside URL
    public String index(@RequestParam(value = "name", required = false) String fname, @RequestParam(value = "last_name", required = false) String lname, @RequestParam(value = "times",required = false ) Integer num) {

        if ((fname == null || fname.isEmpty()) && (lname == null || lname.isEmpty()) && (num == null)) {
            return "Hello Human"; // to print Hello  Human if is no name and last_name is found
        }
        else if (lname == null || lname.isEmpty() && (num == null)) {
            return "Hello " + fname; // to print Hello name  if name is found but last_name is not found
        }
        else {
            return "Hello " + fname + " " + lname; // to print Hello name last_name if name is found and last_name is found
        }
    }
}
