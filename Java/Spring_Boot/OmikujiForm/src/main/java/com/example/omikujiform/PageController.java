package com.example.omikujiform;

import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

// set_data
@Controller
@RequestMapping("/omikuji")
public class PageController {
    @GetMapping("")
    public String index(){
        return "page";
    }

    @PostMapping("/set_data")
    public String setData(
            @RequestParam(value = "num") String num,
            @RequestParam(value = "city") String city,
            @RequestParam(value = "name") String name,
            @RequestParam(value = "end_hop") String endHop,
            @RequestParam(value = "type") String type,
            @RequestParam(value = "nice") String nice,
            HttpSession session
    ){
        session.setAttribute("num",num);
        session.setAttribute("city",city);
        session.setAttribute("name",name);
        session.setAttribute("end_hop",endHop);
        session.setAttribute("type",type);
        session.setAttribute("nice",nice);
        return "redirect:/omikuji/show";
    }

    @GetMapping("/set_data")
    public String returnToPage(){
        return "redirect:/omikuji";
    }

    @GetMapping("/show")
    public String show(){
        return "show";
    }

}
