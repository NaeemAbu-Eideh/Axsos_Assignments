package com.example.bookclub.controllers;

import com.example.bookclub.models.Author;
import com.example.bookclub.models.AuthorLogin;
import com.example.bookclub.models.Book;
import com.example.bookclub.repositories.BookRepository;
import com.example.bookclub.services.AuthorService;
import com.example.bookclub.services.BookService;
import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;
import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class PageController {
    @Autowired
    BookService bookService;
    @Autowired
    AuthorService authorService;

    @GetMapping("/")
    public String loginRegister(
            @ModelAttribute("register") Author author,
            @ModelAttribute("login")AuthorLogin authorLogin,
            HttpSession session
            ) {
        if(session.getAttribute("user_id") != null) {
            return "redirect:/books";
        }
        return "login_register.jsp";
    }

    @GetMapping("/register")
    public String returnToLoginRegister(){
        return "redirect:";
    }

    @PostMapping("/register")
    public String register(
            @Valid @ModelAttribute("register") Author author,
            BindingResult result,
            @ModelAttribute("login") AuthorLogin authorLogin,
            HttpSession session
    ){
        if(result.hasErrors()){
            return "login_register.jsp";
        }
        String password = BCrypt.hashpw(author.getPassword(), BCrypt.gensalt());
        author.setPassword(password);
        Author target = authorService.saveAuthor(author);
        session.setAttribute("user_id", target.getId());
        return "redirect:/books";
    }

    @GetMapping("/login")
    public String goToLoginRegister(){
        return "redirect:";
    }

    @PostMapping("/login")
    public String login(
            @ModelAttribute("register") Author author,
            @Valid @ModelAttribute("login") AuthorLogin authorLogin,
            BindingResult result,
            HttpSession session
    ){
        if(result.hasErrors()){
            return "login_register.jsp";
        }
        Author target = authorService.checkAuthor(authorService.findAuthorByEmail(authorLogin.getEmail()), authorLogin, result);
        if(target == null){
            return "login_register.jsp";
        }
        session.setAttribute("user_id", target.getId());
        return "redirect:/books";
    }

    @GetMapping("/books")
    public String books(
            HttpSession session,
            Model model
    ){
        if(session.getAttribute("user_id") == null) {
            return "redirect:";
        }
        Author author = authorService.findAuthorById((Long)session.getAttribute("user_id"));
        List<Book> books = bookService.findAllBooks();
        model.addAttribute("author", author);
        model.addAttribute("books", books);
        return "books.jsp";
    }

    @GetMapping("/flush")
    public String flush(
            HttpSession session
    ){
        session.removeAttribute("user_id");
        return "redirect:";
    }

    @GetMapping("/books/new")
    public String newBook(
            @ModelAttribute("books") Book book,
            HttpSession session
    ){
        if(session.getAttribute("user_id") == null) {
            return "redirect:";
        }
        return "add_book.jsp";
    }

    @GetMapping("/books/new/add")
    public String returnToAddBook(@ModelAttribute("books") Book book){
        return "add_book.jsp";
    }

    @PostMapping("/books/new/add")
    public String addBook(
            @Valid @ModelAttribute("books") Book book,
            BindingResult result,
            HttpSession session
    ){
        if(result.hasErrors()){
            return "add_book.jsp";
        }
        Author author = authorService.findAuthorById((Long)session.getAttribute("user_id"));
        book.setAuthor(author);
        Book target =bookService.saveBook(book);
//        author.getBooks().add(target);
//        authorService.saveAuthor(author);
        return "redirect:/books/" + target.getId();
    }

    @GetMapping("/books/{id}")
    public String showBook(
            @PathVariable("id") Long id,
            HttpSession session,
            Model model
    ){
        if(session.getAttribute("user_id") == null) {
            return "redirect:";
        }
        model.addAttribute("author", authorService.findAuthorById((Long)session.getAttribute("user_id")));
        model.addAttribute("book", bookService.findBookById(id));
        return "show_book.jsp";
    }

    @GetMapping("/books/{id}/edit")
    public String showEditBook(
            @PathVariable("id") Long id,
            @ModelAttribute("books") Book book,
            HttpSession session,
            Model model){
        if(session.getAttribute("user_id") == null) {
            return "redirect:";
        }
        model.addAttribute("book", bookService.findBookById(id));
        return "edit_book.jsp";
    }

    @GetMapping("/books/{id}/edit/save-edit")
    public String returnToEditBook(
            @PathVariable("id") Long id,
            @ModelAttribute("books") Book boock
            ){
        return "edit_book.jsp";
    }

    @PostMapping("/books/{id}/edit/save-edit")
    public String saveEditBook(
            @PathVariable("id") Long id,
            @Valid @ModelAttribute("books") Book bock,
            BindingResult result,
            HttpSession session
    ){
        if(result.hasErrors()){
            return "edit_book.jsp";
        }
        Book target = bookService.findBookById(id);
        target.setTitle(bock.getTitle());
        target.setAuthorName(bock.getAuthorName());
        target.setThought(bock.getThought());
        bookService.saveBook(target);
        return "redirect:/books/" + target.getId();
    }

    @GetMapping("/books/{id}/delete")
    public String deleteBook( @PathVariable("id") Long id ){
        Book book = bookService.findBookById(id);
        bookService.deleteBook(book);
        return "redirect:/books";
    }
}
