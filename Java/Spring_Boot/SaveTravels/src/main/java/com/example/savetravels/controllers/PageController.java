package com.example.savetravels.controllers;

import com.example.savetravels.models.Travel;
import com.example.savetravels.services.TravelService;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@Controller
@RequestMapping("/expenses")
public class PageController {
    private final TravelService travelService;

    public PageController(TravelService travelService) {
        this.travelService = travelService;
    }

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String index(@ModelAttribute("travel") Travel travel, Model model) {
        ArrayList<Travel> arr = travelService.getAllTravels();
        model.addAttribute("travels", arr);
        return "page.jsp";
    }

    @RequestMapping(value = "/add-travel", method = RequestMethod.GET)
    public String goToAddTravel() {
        return "redirect:";
    }

    @RequestMapping(value = "/add-travel", method = RequestMethod.POST)
    public String addTravel(@Valid @ModelAttribute("travel") Travel travel, BindingResult result) {
        if (result.hasErrors()) {
            return "redirect:/expenses";
        }
        Travel travel2 = travelService.saveTravel(travel);
        System.out.println(travel2.getExpense());
        return "redirect:/expenses";
    }

    @GetMapping("/edit/{id}")
    public String editTravel(
            @ModelAttribute("travel")   Travel travel,
            @PathVariable("id") Long id,
            Model model
    ) {
        model.addAttribute("travel", travelService.findTravelById(id));
        return "edit.jsp";
    }

    @GetMapping("/edit/{id}/save-edit")
    public String goToEditTravel(
            @PathVariable("id") Long id

    ){
        return "redirect:/expenses/edit/" + id;
    }

    @PostMapping("/edit/{id}/save-edit")
    public String editTravel(
            @PathVariable("id") Long id,
            @Valid @ModelAttribute("travel") Travel travel, BindingResult result,
            Model model
    ){
        if(result.hasErrors()) {
            return "redirect:/expenses/edit/" + id;
        }

        travelService.updateTravel(id, travel.getExpense(), travel.getVendor(), travel.getAmount(), travel.getDescription());
        return "redirect:/expenses";
    }

    @GetMapping("/{id}")
    public String goToViewTravel(
            @PathVariable("id") Long id,
            Model model
    ){
        model.addAttribute("travel", travelService.findTravelById(id));
        return "show_travel.jsp";
    }

    @GetMapping("/delete")
    public String returnToTravels(){
        return "redirect:/expenses";
    }

    @PostMapping("/delete")
    public String deleteTravel(
            @RequestParam("id") Long id
    ){
        travelService.deleteTravel(id);
        return "redirect:/expenses";
    }
}


