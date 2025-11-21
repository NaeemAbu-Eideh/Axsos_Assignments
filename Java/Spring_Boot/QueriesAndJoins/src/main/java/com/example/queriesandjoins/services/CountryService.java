package com.example.queriesandjoins.services;

import com.example.queriesandjoins.models.Country;
import com.example.queriesandjoins.repositories.CityRepository;
import com.example.queriesandjoins.repositories.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class CountryService {
    @Autowired
    private CountryRepository countryRepository;

    public List<Object[]> findSlovenCountries(String language) {
        return countryRepository.findByLanguage(language);
    }

    public List<Object[]> findNumberCountryCities() {
        return countryRepository.findNumberOfCountryCities();
    }

    public List<Object[]> findAllMexicoCities(String country, long population) {
        return countryRepository.findCityPopulation(country, population);
    }

    public List<Object[]> findLanguagePercentage(int percentage) {
        return countryRepository.findLanguagePercentage(percentage);
    }

    public List<Object[]> findSurface(int surface_area, long population) {
        return countryRepository.findSurface(surface_area, population);
    }

    public List<Object[]> findGovernment(String government, int surface_area, int life_expectancy) {
        return countryRepository.findGovernmentForm(government, surface_area, life_expectancy);
    }

    public List<Object[]> findCitiesInCountry(String country_name, String district, int population) {
        return countryRepository.findCitiesInCountry(country_name, district, population);
    }

    public List<Object[]> findCountriesInRegions() {
        return countryRepository.findNumberOfRegions();
    }

}
