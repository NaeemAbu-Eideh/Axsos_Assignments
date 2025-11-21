package com.example.queriesandjoins.services;

import com.example.queriesandjoins.repositories.LanguageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LanguageService {
    @Autowired
    LanguageRepository languageRepository;
}
