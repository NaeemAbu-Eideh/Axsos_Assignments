package com.example.productsandcategories.services;

import com.example.productsandcategories.models.Product;
import com.example.productsandcategories.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    ProductRepository productRepository;

    public List<Product> getAllProducts(){
        return (List<Product>) productRepository.findAll();
    }

    public Product getProductById(Long id){
        Optional<Product> target = productRepository.findById(id);
        return target.orElse(null);
    }

    public void  saveProduct(Product product){
        productRepository.save(product);
    }
}
