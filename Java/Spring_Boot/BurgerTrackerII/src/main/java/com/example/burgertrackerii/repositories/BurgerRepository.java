package com.example.burgertrackerii.repositories;

import com.example.burgertrackerii.models.Burger;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BurgerRepository extends CrudRepository<Burger,Long> {
}
