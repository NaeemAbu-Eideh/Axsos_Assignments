package com.example.burgertraker.services;

import com.example.burgertraker.models.Burger;
import com.example.burgertraker.repositories.BurgerRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BurgerService {
    private final BurgerRepository burgerRepository;
    public BurgerService(BurgerRepository burgerRepository) {
        this.burgerRepository = burgerRepository;
    }


    public void saveBurger(Burger burger) {
        burgerRepository.save(burger);
    }

    public Burger createBurger(String burgerName, String restName, String note, int rate) {
        Burger burger = new Burger(burgerName, restName, rate, note);
        saveBurger(burger);
        return burger;
    }

    public ArrayList<Burger> getAllBurgers() {
        ArrayList<Burger> burgers = new ArrayList<>();
        burgers = (ArrayList<Burger>)burgerRepository.findAll();
        return burgers;
    }
}
