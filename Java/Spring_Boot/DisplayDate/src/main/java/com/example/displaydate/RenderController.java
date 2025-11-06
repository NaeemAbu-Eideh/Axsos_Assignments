package com.example.displaydate;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Date;
import java.text.SimpleDateFormat;

@Controller
public class RenderController {
    public String getDateOrTime(String data){ // this method return the Date or Time base of the data atrebute dcome from date and time methods
        Date date = new Date();
        SimpleDateFormat dateFormat =  new SimpleDateFormat();
        if(data.equals("date")){
            dateFormat = new SimpleDateFormat("EEEE, MMM dd, yyyy");
        }
        else{
            dateFormat = new SimpleDateFormat("h:mm a");
        }
        String dateString = dateFormat.format(date);
        return dateString;
    }

    @RequestMapping("/")
    public String index() {

        return "index.jsp";
    }

    @RequestMapping("/date")
    public String date(Model model) { // this method get the Date and make it in the format ("EEEE, MMM dd, yyyy") and store it in model to use it in HTML page
        String dateString =  getDateOrTime("date");
        model.addAttribute("date", dateString);
        return "date.jsp";
    }

    @RequestMapping("/time")
    public String time(Model model) { // this method get the Time and make it in the format ("h:mm a") and store it in model to use it in HTML page
        String timeString = getDateOrTime("time");
        model.addAttribute("time", timeString);
        return "time.jsp";
    }

}
