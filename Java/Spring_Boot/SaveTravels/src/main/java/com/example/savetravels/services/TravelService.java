package com.example.savetravels.services;

import com.example.savetravels.models.Travel;
import com.example.savetravels.repositories.TravelRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class TravelService {
    private final TravelRepository travelRepository;
    public TravelService(TravelRepository travelRepository) {
        this.travelRepository = travelRepository;
    }


    public Travel saveTravel(Travel travel) {
        return travelRepository.save(travel);
    }
    public Travel createBurger(String expense, String vendor, String desc, double amount) {
        Travel travel = new Travel(expense, vendor, amount, desc);
        saveTravel(travel);
        return travel;
    }

    public ArrayList<Travel> getAllTravels() {
        ArrayList<Travel> travels = new ArrayList<>();
        travels = (ArrayList<Travel>)travelRepository.findAll();
        return travels;
    }

    public Travel findTravelById(Long id) {
        Optional<Travel> target = travelRepository.findById(id);
        return target.orElse(null);
    }

    public void updateTravel(Long id, String expense, String vendor, double amount, String desc) {
        Optional<Travel> target = travelRepository.findById(id);
        if(target.isPresent()) {
            Travel travel = target.get();
            travel.setExpense(expense);
            travel.setVendor(vendor);
            travel.setAmount(amount);
            travel.setDescription(desc);
            saveTravel(travel);
        }

    }

    public void updateTravel(Travel travel){
        updateTravel(travel.getId(), travel.getExpense(), travel.getVendor(), travel.getAmount(), travel.getDescription());
    }

    public void deleteTravel(Long id) {
        travelRepository.deleteById(id);
    }
}
