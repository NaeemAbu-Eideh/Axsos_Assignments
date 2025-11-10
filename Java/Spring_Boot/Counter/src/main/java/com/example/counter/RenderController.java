package com.example.counter;

import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/your_server")
public class RenderController {
    @RequestMapping("")
    public String index(HttpSession session) {
        if(session.getAttribute("count")==null){
            session.setAttribute("count",1);
        }
        else{
            int count= (int)session.getAttribute("count");
            count++;
            session.setAttribute("count", count);
        }
        return "index.jsp";
    }

    @RequestMapping("/counter")
    public String counter() {
        return "links.jsp";
    }

}
