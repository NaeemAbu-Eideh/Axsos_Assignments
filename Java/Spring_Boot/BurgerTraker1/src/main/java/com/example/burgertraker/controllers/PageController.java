package com.example.burgertraker.controllers;

import com.example.burgertraker.models.Burger;
import com.example.burgertraker.services.BurgerService;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;

@Controller
public class PageController {
    private final BurgerService burgerService;
    public PageController(BurgerService burgerService) {
        this.burgerService = burgerService;
    }
    @GetMapping("/")
    public String index(@ModelAttribute("burger")  Burger burger, Model model) {
        ArrayList<Burger> arr = burgerService.getAllBurgers();
        model.addAttribute("burgers",arr);
        return "page.jsp";
    }

    @PostMapping("/add-burger")
    public String addBurger(@Valid @ModelAttribute("burger") Burger burger, BindingResult result) {
        if (result.hasErrors()) {
            return "redirect:";
        }
        burgerService.saveBurger(burger);
        return "redirect:";
    }

}
