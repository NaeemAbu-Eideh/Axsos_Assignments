package com.example.bookclub.services;

import com.example.bookclub.models.Book;
import com.example.bookclub.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {
    @Autowired
    BookRepository bookRepository;

    public Book saveBook(Book book) {
        return bookRepository.save(book);
    }

    public List<Book> findAllBooks() {
        return (List<Book>)  bookRepository.findAll();
    }

    public Book findBookById(Long id) {
        Optional<Book> target = bookRepository.findById(id);
        return target.orElse(null);
    }

    public void deleteBook(Book book) {
        bookRepository.delete(book);
    }
}
