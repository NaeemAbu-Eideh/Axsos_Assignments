package com.example.renderingallbooks.controllers;

import com.example.renderingallbooks.models.Book;
import com.example.renderingallbooks.services.BookService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PageController {
    private final BookService bookService;
    public PageController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/")
    public String newBook(){
        return "new_book.jsp";
    }

    @GetMapping("/books/{id}")
    public String books(
            Model model,
            @PathVariable("id") Long id
    ){
        Book book = bookService.findBookById(id);
        model.addAttribute("title", book.getTitle());
        model.addAttribute("desc", book.getDescription());
        model.addAttribute("lang", book.getLanguage());
        model.addAttribute("pages", book.getPages());
        return "book.jsp";
    }

    @GetMapping("/add-book")
    public String goTooAddBook(){
        return "redirect:";
    }

    @PostMapping("/add-book")
    public String addBook(
            @RequestParam("title") String title,
            @RequestParam("desc") String desc,
            @RequestParam("lang") String lang,
            @RequestParam("pages") Integer Pages
    ){
        System.out.println("naeem");
        Book book = new Book(title, desc, lang, Pages);
        Book target = bookService.addBook(book);
        return "redirect:/books/" + target.getId();
    }

    @GetMapping("/books")
    public String books(Model model){
        model.addAttribute("books", bookService.findAllBooks());
        return "books.jsp";
    }
}