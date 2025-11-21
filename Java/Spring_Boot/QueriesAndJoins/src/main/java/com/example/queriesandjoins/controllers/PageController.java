package com.example.queriesandjoins.controllers;

import com.example.queriesandjoins.services.CityService;
import com.example.queriesandjoins.services.CountryService;
import com.example.queriesandjoins.services.LanguageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {
    @Autowired
    CountryService countryService;

    @Autowired
    LanguageService languageService;

    @Autowired
    CityService cityService;


    @GetMapping("/")
    public String index(
            Model model
    ) {
        model.addAttribute("query1", countryService.findSlovenCountries("Slovene"));
        model.addAttribute("query2", countryService.findNumberCountryCities());
        model.addAttribute("query3", countryService.findAllMexicoCities("Mexico", 500000));
        model.addAttribute("query4", countryService.findLanguagePercentage(89));
        model.addAttribute("query5", countryService.findSurface(501, 100000));
        model.addAttribute("query6", countryService.findGovernment("Constitutional Monarchy", 200, 75));
        model.addAttribute("query7", countryService.findCitiesInCountry("Argantina", "Buenos Aires", 500000));
        model.addAttribute("query8", countryService.findCountriesInRegions());
        return "index.jsp";
    }
}
