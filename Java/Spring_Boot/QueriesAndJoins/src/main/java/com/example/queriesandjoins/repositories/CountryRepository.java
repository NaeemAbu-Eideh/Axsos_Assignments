package com.example.queriesandjoins.repositories;

import com.example.queriesandjoins.models.Country;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CountryRepository extends CrudRepository<Country, Integer> {

    @Query(
            value = "SELECT world.countries.name as name, world.languages.language as language, world.languages.percentage as percentage FROM (world.countries left join world.languages on world.countries.id = world.languages.country_id) where world.languages.language = 'Slovene' order by world.languages.percentage desc",
            nativeQuery = true
    )
    List<Object[]> findByLanguage(String language);


    @Query(value = "SELECT world.countries.name, count(world.cities.id) FROM (world.countries left join world.cities on world.countries.id = world.cities.country_id) group by world.countries.name order by count(world.cities.id) desc;", nativeQuery = true)
    List<Object[]> findNumberOfCountryCities();

    @Query(value = "SELECT world.cities.name, world.cities.population FROM (world.countries left join world.cities on world.countries.id = world.cities.country_id) where world.countries.name = 'Mexico' and world.cities.population > 500000 order by world.cities.population desc;", nativeQuery = true)
    List<Object[]> findCityPopulation(String country_name, long population);

    @Query(value = "SELECT world.countries.name, world.languages.language, world.languages.percentage FROM (world.countries left join world.languages on world.countries.id = world.languages.country_id) where world.languages.percentage > 89 order by world.languages.percentage desc;", nativeQuery = true)
    List<Object[]> findLanguagePercentage(int percentage);

    @Query(value = "SELECT world.countries.name, world.cities.name, world.countries.surface_area, world.cities.population FROM (world.countries left join world.cities on world.countries.id = world.cities.country_id) where world.countries.surface_area < 501 and world.cities.population > 100000;", nativeQuery = true)
    List<Object[]> findSurface( int surface ,long population);

    @Query(value = "SELECT world.countries.name, world.countries.government_form, world.countries.surface_area, world.countries.life_expectancy FROM  world.countries where world.countries.government_form = 'Constitutional Monarchy' and world.countries.surface_area > 200 and world.countries.life_expectancy > 75;", nativeQuery = true)
    List<Object[]> findGovernmentForm(String government, int surface_area, int life_expectancy);

    @Query(value = "SELECT world.countries.name, world.cities.name, world.cities.district, world.cities.population FROM (world.countries left join world.cities on world.countries.id = world.cities.country_id) where world.countries.name = 'Argentina' and world.cities.district = 'Buenos Aires' and world.cities.population > 500000;", nativeQuery = true)
    List<Object[]> findCitiesInCountry(String country_name, String district,  int population);

    @Query(value = "SELECT world.countries.region, count(world.countries.id) FROM world.countries group by world.countries.region order by count(world.countries.id) desc;", nativeQuery = true)
    List<Object[]> findNumberOfRegions();
}
