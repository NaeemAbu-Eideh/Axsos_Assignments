package com.example.loginregistration.controllers;
import com.example.loginregistration.models.User;
import com.example.loginregistration.models.UserLogin;
import com.example.loginregistration.services.UserService;
import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;
import org.mindrot.jbcrypt.BCrypt;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PageController {
    private final UserService userService;

    public PageController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("")
    public String index(
            @ModelAttribute("register") User user,
            @ModelAttribute("login") UserLogin userLogin,
            HttpSession session
    ) {
        if(session.getAttribute("user") != null) {
            return "redirect:/welcome";
        }
        return "login_register.jsp";
    }

    @GetMapping("/register")
    public String redirectRegister(@ModelAttribute("register") User user){
        return "redirect:/";
    }

    @PostMapping("/register")
    public String register(
            @Valid @ModelAttribute("register") User user,
            BindingResult result,
            @ModelAttribute("login") UserLogin userLogin,
            HttpSession session
    ){
        if(result.hasErrors()){
            return "login_register.jsp";
        }
        String password = BCrypt.hashpw(user.getPassword(), BCrypt.gensalt());
        user.setPassword(password);
        userService.saveUser(user);
        session.setAttribute("user", user.getUsername());
        return "redirect:/welcome";
    }

    @GetMapping("/login")
    public String redirectLogin(@ModelAttribute("login") UserLogin userLogin){
        return "redirect:/";
    }

    @PostMapping("/login")
    public String login(
            @Valid@ModelAttribute("login") UserLogin userLogin,
            BindingResult result,
            @ModelAttribute("register") User user,
            HttpSession session
    ){

        if(result.hasErrors()){
            return "login_register.jsp";
        }
        User target = userService.checkUser(userService.getUserByEmail(userLogin.getEmail()), userLogin, result);
        if(target == null){
            return "login_register.jsp";
        }
        session.setAttribute("user", target.getUsername());
        return "redirect:/welcome";
    }

    @GetMapping("/welcome")
    public String show(
            HttpSession session
    ){
        if(session.getAttribute("user") == null){
            return "redirect:/";
        }
        return "show.jsp";
    }

    @GetMapping("/welcome/logout")
    public String logout(HttpSession session){
        session.removeAttribute("user");
        return "redirect:/";
    }
}
