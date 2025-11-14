package com.example.burgertrackerii.controllers;

import com.example.burgertrackerii.models.Burger;
import com.example.burgertrackerii.services.BurgerService;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
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

    @GetMapping("/burgers/edit/{id}")
    public String editBurger(
            @ModelAttribute("burger")   Burger burger,
            @PathVariable("id") Long id, Model model
    ) {
        model.addAttribute("burger", burgerService.findBurgerById(id));
        return "edit.jsp";
    }

    @GetMapping("/burgers/edit/{id}/save-edit")
    public String goToEditBurger(
            @PathVariable("id") Long id

    ){
        return "redirect:/burgers/edit/" + id;
    }

    @PostMapping("/burgers/edit/{id}/save-edit")
    public String editBurger(
            @PathVariable("id") Long id,
            @Valid @ModelAttribute("burger") Burger burger, BindingResult result,
            Model model
    ){
        if(result.hasErrors()) {
            return "redirect:/burgers/edit/" + id;
        }
        burgerService.updateBurger(burger);
        return "redirect:/";
    }

}
