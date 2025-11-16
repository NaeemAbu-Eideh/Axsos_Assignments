package com.example.dojosandninjas.services;

import com.example.dojosandninjas.models.Dojo;
import com.example.dojosandninjas.models.Ninja;
import com.example.dojosandninjas.repositories.NinjaRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class NinjaService {
    private final NinjaRepository  ninjaRepository;
    public NinjaService(NinjaRepository ninjaRepository) {
        this.ninjaRepository = ninjaRepository;
    }

    public ArrayList<Ninja> getNinjas() {
        return (ArrayList<Ninja>)  ninjaRepository.findAll();
    }

    public Ninja addNinja(String fname, String lname, int age){
        Ninja ninja = new Ninja();
        ninja.setFirst_name(fname);
        ninja.setLast_name(lname);
        ninja.setAge(age);
        saveNinja(ninja);
        return ninja;
    }

    public void saveNinja(Ninja ninja){
        ninjaRepository.save(ninja);
    }
    public Ninja getNinja(Long id){
        Optional<Ninja> ninja = ninjaRepository.findById(id);
        return ninja.orElse(null);
    }

    public void deleteNinja(Long id){
        ninjaRepository.deleteById(id);
    }

    public Ninja  updateNinja(Long id, String fname, String lname, int age){
        Optional<Ninja> ninjaOptional = ninjaRepository.findById(id);
        if(ninjaOptional.isPresent()){
            Ninja ninjaUpdate = ninjaOptional.get();
            ninjaUpdate.setFirst_name(fname);
            ninjaUpdate.setLast_name(lname);
            ninjaUpdate.setAge(age);
            ninjaRepository.save(ninjaUpdate);
            return ninjaUpdate;
        }
        return null;
    }

    public void addDojoToNinja(Long id, Dojo dojo){
        Optional<Ninja> ninjaOptional = ninjaRepository.findById(id);
        if(ninjaOptional.isPresent()){
            Ninja ninjaUpdate = ninjaOptional.get();
            ninjaUpdate.setDojo(dojo);
            ninjaRepository.save(ninjaUpdate);
        }
    }

    public Dojo getDojoFromNinja(Long id){
        Optional<Ninja> ninjaOptional = ninjaRepository.findById(id);
        if(ninjaOptional.isPresent()){
            Ninja ninja = ninjaOptional.get();
            return ninja.getDojo();
        }
        return null;
    }

}
