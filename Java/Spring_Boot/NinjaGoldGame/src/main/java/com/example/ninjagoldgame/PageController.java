package com.example.ninjagoldgame;

import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.Random;
import java.util.ArrayList;
import java.util.Date;
import java.text.SimpleDateFormat;

@Controller
public class PageController {
    @GetMapping("")
    public String index() {
       return "page";
    }

    @GetMapping("/get-gold")
    public String goToIndex() {
        return "redirect:";
    }

    @PostMapping("/get-gold")
    public String postGold(
            @RequestParam(value = "hidden_input") String hiddenInput,
            HttpSession session
    ) {
        if(session.getAttribute("gold") == null){
            session.setAttribute("gold", 0);
        }
        if(session.getAttribute("activates") == null){
            session.setAttribute("activates", new ArrayList<String>());
        }
        Random random = new Random();
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        String dateString = formatter.format(date);
        String message = "";
        if(hiddenInput.equals("farm")){
            int num = (int)session.getAttribute("gold");
            num +=  random.nextInt(10, 21);
            session.setAttribute("gold", num);
            message = "You entered a farm and earned " + num + "gold (" + dateString + " )";
        }
        else if(hiddenInput.equals("cave")){
            int num = (int)session.getAttribute("gold");
            num +=  random.nextInt(10, 21);
            session.setAttribute("gold", num);
            message = "You entered a cave and earned " + num + "gold (" + dateString + " )";
        }
        else if(hiddenInput.equals("house")){
            int num = (int)session.getAttribute("gold");
            num +=  random.nextInt(10, 21);
            session.setAttribute("gold", num);
            message = "You entered a house and earned " + num + "gold (" + dateString + " )";
        }
        else{
            int num = (int)session.getAttribute("gold");
            int index = random.nextInt(0, 2);
            int gold = random.nextInt(0, 51);
            if(index == 0){
                num -= gold;
                message = "You complete a quest and earned " + num + "gold (" + dateString + " )";
            }
            else{
                num += gold;
                message = "You failed a quest and lost " + num + "gold. Ouch. (" + dateString + " )";
            }
            session.setAttribute("gold", num);
        }
        ArrayList<String> arr = (ArrayList<String>) session.getAttribute("activates");
        arr.add(message);
        session.setAttribute("activates", arr);
        return "redirect:";
    }
}
