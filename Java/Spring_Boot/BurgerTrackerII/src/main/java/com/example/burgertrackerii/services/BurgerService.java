package com.example.burgertrackerii.services;

import com.example.burgertrackerii.models.Burger;
import com.example.burgertrackerii.repositories.BurgerRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

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

    public Burger findBurgerById(Long id) {
        Optional<Burger> target = burgerRepository.findById(id);
        return target.orElse(null);
    }

    public void updateBurger(Long id, String burgerName, String restName, int rate, String note) {
        Optional<Burger> target = burgerRepository.findById(id);
        if(target.isPresent()) {
            Burger burger = target.get();
            burger.setBurgerName(burgerName);
            burger.setRestName(restName);
            burger.setRate(rate);
            burger.setNote(note);
            saveBurger(burger);
        }

    }

    public void updateBurger(Burger burger){
        updateBurger(burger.getId(), burger.getBurgerName(), burger.getRestName(), burger.getRate(), burger.getNote());
    }
}
