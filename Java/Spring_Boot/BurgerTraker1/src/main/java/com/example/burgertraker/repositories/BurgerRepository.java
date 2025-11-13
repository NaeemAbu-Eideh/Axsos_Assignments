package com.example.burgertraker.repositories;

import com.example.burgertraker.models.Burger;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BurgerRepository extends CrudRepository<Burger,Long> {
}
