package com.example.dojosandninjas.services;

import com.example.dojosandninjas.models.Dojo;
import com.example.dojosandninjas.models.Ninja;
import com.example.dojosandninjas.repositories.DojoRepository;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class DojoService {
    private final DojoRepository dojoRepository;
    public DojoService(DojoRepository dojoRepository) {
        this.dojoRepository = dojoRepository;
    }

    public void saveDojo(Dojo dojo) {
        dojoRepository.save(dojo);
    }

    public Dojo getDojoById(Long id) {
        Optional<Dojo> dojo = dojoRepository.findById(id);
        return dojo.orElse(null);
    }

    public List<Dojo> findAllDojos(){
        return dojoRepository.findAll();
    }

//    public ArrayList<Dojo> getAllDojos(){
//        System.out.println("hello i am here helllllo");
//        return (ArrayList<Dojo>) dojoRepository.findAll();
//    }


    public Dojo updateDojo(Long id, String name) {
        Optional<Dojo> target = dojoRepository.findById(id);
        if (target.isPresent()) {
            Dojo dojo = target.get();
            dojo.setName(name);
            return dojoRepository.save(dojo);
        }
        return null;
    }

    public void deleteDojo(Long id) {
        Optional<Dojo> dojo = dojoRepository.findById(id);
    }

    public ArrayList<Ninja> getAllNinjasFromDojo(Long id) {
        Optional<Dojo> target = dojoRepository.findById(id);
        if (target.isPresent()) {
            Dojo dojo = target.get();
            return (ArrayList<Ninja>) dojo.getNinjas();
        }
        return null;
    }

    public void addNinjaToDojo(Long id, Ninja ninja) {
        Optional<Dojo> target = dojoRepository.findById(id);
        if (target.isPresent()) {
            Dojo dojo = target.get();
//            dojo.setNinja(ninja);
            dojoRepository.save(dojo);
        }
    }

}
