package com.example.productsandcategories.services;

import com.example.productsandcategories.models.Category;
import com.example.productsandcategories.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {
    @Autowired
    CategoryRepository categoryRepository;

    public List<Category> getAllCategories(){
        return (List<Category>) categoryRepository.findAll();
    }

    public Category getCategoryById(Long id){
        Optional<Category> target = categoryRepository.findById(id);
        return target.orElse(null);
    }

    public void saveCategory(Category category){
        categoryRepository.save(category);
    }
}
