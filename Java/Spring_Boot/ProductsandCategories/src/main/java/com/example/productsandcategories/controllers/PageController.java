package com.example.productsandcategories.controllers;

import com.example.productsandcategories.models.Category;
import com.example.productsandcategories.models.Product;
import com.example.productsandcategories.services.CategoryService;
import com.example.productsandcategories.services.ProductService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
public class PageController {
    @Autowired
    ProductService productService;

    @Autowired
    CategoryService categoryService;


    @GetMapping("")
    public String showProductsCategories(Model model) {
        model.addAttribute("products", productService.getAllProducts());
        model.addAttribute("categories", categoryService.getAllCategories());
        return "products_categories.jsp";
    }

    @GetMapping("/products/new")
    public String showNewProduct(
            @ModelAttribute("product")Product product
            ) {
        return "new_product.jsp";
    }

    @GetMapping("/products/new/add-product")
    public String returnToNewProduct(){
        return "redirect:/products/new";
    }

    @PostMapping("/products/new/add-product")
    public String addNewProduct(
            @Valid @ModelAttribute("product") Product product,
            BindingResult result
    ){
        if(result.hasErrors()){
            return "new_product.jsp";
        }
        productService.saveProduct(product);
        return "redirect:/";
    }

    @GetMapping("/categories/new")
    public String showNewCategories(@ModelAttribute("category") Category category) {
        return "new_category.jsp";
    }

    @GetMapping("categories/new/add-category")
    public String returnToNewCategory(){
        return "redirect:/categories/new";
    }

    @PostMapping("categories/new/add-category")
    public String addNewCategory(
            @Valid @ModelAttribute("category") Category category,
            BindingResult result
    ){
        if(result.hasErrors()){
            return "new_category.jsp";
        }
        categoryService.saveCategory(category);
        return "redirect:/";
    }

    @GetMapping("/products/{id}")
    public String showProduct(
            Model model,
            @PathVariable("id") Long id
    ){
        model.addAttribute("product", productService.getProductById(id));
        model.addAttribute("categories", categoryService.getAllCategories());
        return "show_product.jsp";
    }

    @GetMapping("/products/{id}/add")
    public String returnToAddCategoryToProduct(
            @PathVariable("id") Long id
    ){
        return "redirect:/products/" + id;
    }

    @PostMapping("/products/{id}/add")
    public String addCategory(
            @PathVariable("id") Long id,
            @RequestParam(name = "category_id") Long category_id
    ){
        if(category_id == -1){
            return "redirect:/products/" + id;
        }
        System.out.println("category_id = " + category_id);
        if(category_id == null){
            return "redirect:/products/" + id;
        }
        Product product = productService.getProductById(id);
        Category category = categoryService.getCategoryById(category_id);
        product.getCategories().add(category);
        productService.saveProduct(product);
        return "redirect:/products/" + id;
    }

    @GetMapping("/categories/{id}")
    public String showCategory(
            Model model,
            @PathVariable("id") Long id
    ){
        model.addAttribute("category", categoryService.getCategoryById(id));
        model.addAttribute("products", productService.getAllProducts());
        return "show_category.jsp";
    }

    @GetMapping("/categories/{id}/add")
    public String returnToAddProductToCategory(
            @PathVariable("id") Long id
    ){
        return "redirect:/categories/" + id;
    }

    @PostMapping("/categories/{id}/add")
    public String addProduct(
            @PathVariable("id") Long id,
            @RequestParam(name = "product_id") Long product_id
    ){
        if(id == -1){
            return "redirect:/categories/" + id;
        }
        Category category = categoryService.getCategoryById(id);
        Product product = productService.getProductById(product_id);
        category.getProducts().add(product);
        categoryService.saveCategory(category);
        return "redirect:/categories/" + id;
    }

}
