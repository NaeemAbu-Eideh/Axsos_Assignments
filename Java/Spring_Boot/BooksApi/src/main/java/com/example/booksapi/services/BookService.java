package com.example.booksapi.services;


import com.example.booksapi.models.Book;
import com.example.booksapi.repositories.BookRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BookService {
    private  final BookRepository bookRepository;
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void createBook(String title, String desc, String lang, Integer pages) {
        Book book = new Book(title, desc, lang, pages);
        bookRepository.save(book);
    }

    public Book updateBook(Long id,  String title, String desc, String lang, Integer pages) {
        Optional<Book> target = bookRepository.findById(id);
        if(target.isPresent()) {
            Book book = target.get();
            book.setTitle(title);
            book.setDescription(desc);
            book.setDescription(lang);
            book.setPages(pages);
            bookRepository.save(book);
            return book;
        }
        return null;
    }

    public void deleteBook(Long id) {
        bookRepository.deleteById(id);
    }
}
