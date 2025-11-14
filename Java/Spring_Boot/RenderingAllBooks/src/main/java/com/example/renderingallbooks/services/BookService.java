package com.example.renderingallbooks.services;

import com.example.renderingallbooks.models.Book;
import com.example.renderingallbooks.repositories.BookRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class BookService {

    private final BookRepository  bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public Book addBook(Book book) {
        return bookRepository.save(book);
    }

    public Book findBookById(Long id) {
        Optional<Book> book = bookRepository.findById(id);
        return book.orElse(null);
    }

    public ArrayList<Book> findAllBooks() {
        return (ArrayList<Book>) bookRepository.findAll();
    }
}
