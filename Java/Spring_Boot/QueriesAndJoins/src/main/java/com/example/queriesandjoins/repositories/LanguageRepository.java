package com.example.queriesandjoins.repositories;

import com.example.queriesandjoins.models.Language;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LanguageRepository extends CrudRepository<Language, Integer> {
}
