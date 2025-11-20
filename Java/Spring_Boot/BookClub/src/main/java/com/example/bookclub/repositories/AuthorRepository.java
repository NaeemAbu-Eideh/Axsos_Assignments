package com.example.bookclub.repositories;

import com.example.bookclub.models.Author;
import com.example.bookclub.models.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AuthorRepository  extends CrudRepository<Author,Long> {
    Optional<Author> findByEmail(String email);
}
