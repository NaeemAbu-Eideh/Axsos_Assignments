package com.example.dojosandninjas.controllers;


import com.example.dojosandninjas.models.Dojo;
import com.example.dojosandninjas.models.Ninja;
import com.example.dojosandninjas.services.DojoService;
import com.example.dojosandninjas.services.NinjaService;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class PageController {

    private final DojoService dojoService;
    private final NinjaService ninjaService;
    public PageController(DojoService dojoService, NinjaService ninjaService) {
        this.dojoService = dojoService;
        this.ninjaService = ninjaService;
    }

    @GetMapping("/ninjas/new")
    public String listDojos(
            Model model,
            @ModelAttribute("ninjas") Ninja ninja

    ){
        List<Dojo> dojos = dojoService.findAllDojos();
        model.addAttribute("dojos",  dojos);
        return "new_ninja.jsp";
    }

    @GetMapping("/ninjas/new/add-ninja")
    public String returnToNinja(){
        return "redirect:/ninjas/new";
    }

    @PostMapping("/ninjas/new/add-ninja")
    public String addNinja(
            @Valid @ModelAttribute("ninjas") Ninja ninja,
            BindingResult result,
            Model model
    ){
        if(result.hasErrors()){
            List<Dojo> dojos = dojoService.findAllDojos();
            model.addAttribute("dojos",  dojos);
            return "new_ninja.jsp";
        }
        ninjaService.saveNinja(ninja);
        return "redirect:/ninjas/new";
    }

    @GetMapping("/dojos/new")
    public String newPage(
            @ModelAttribute("dojos") Dojo dojo
            ) {

        return "new_dojo.jsp";
    }
    @GetMapping("dojos/new/add-dojo")
    public String returnToNewDojo(){
        return "redirect:/dojos/new";
    }

    @PostMapping("dojos/new/add-dojo")
    public String addDojo(
            @Valid @ModelAttribute("dojos") Dojo dojo,
            BindingResult bindingResult
    ){
        if(bindingResult.hasErrors()){
            return "new_dojo.jsp";
        }
        dojoService.saveDojo(dojo);
        return "redirect:/dojos/new";
    }

    @GetMapping("/dojos/{id}")
    public String returnToDojo(
            @PathVariable("id") Long id,
            Model model
    ){
        Dojo dojo = dojoService.getDojoById(id);
        model.addAttribute("ninjas", dojo.getNinjas());
        return "ninjas_of_dojo.jsp";
    }
}
