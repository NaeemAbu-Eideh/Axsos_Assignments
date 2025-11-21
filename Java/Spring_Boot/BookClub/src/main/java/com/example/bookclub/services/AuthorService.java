package com.example.bookclub.services;

import com.example.bookclub.models.Author;
import com.example.bookclub.models.AuthorLogin;
import com.example.bookclub.repositories.AuthorRepository;
import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import java.util.Optional;

@Service
public class AuthorService {
    @Autowired
    AuthorRepository authorRepository;

    public Author saveAuthor(Author author){
        return authorRepository.save(author);
    }

    public Author findAuthorByEmail(String email){
        Optional<Author> result = authorRepository.findByEmail(email);
        return result.orElse(null);
    }

    public Author findAuthorById(Long id){
        Optional<Author> result = authorRepository.findById(id);
        return result.orElse(null);
    }

    public Author checkAuthor(Author author, AuthorLogin authorLogin, BindingResult result){
        if(author == null){
            result.rejectValue("emailLogin", "error.emailLogin", "The email is not found");
            return null;
        }

        else if(!author.getEmail().equals(authorLogin.getEmailLogin())){
            result.rejectValue("emailLogin", "error.emailLogin", "email or password is incorrect");
            return null;
        }

        else if(!BCrypt.checkpw(authorLogin.getPasswordLogin(), author.getPassword())){
            result.rejectValue("emailLogin", "error.emailLogin", "email or password is incorrect");
            return null;
        }
        return author;
    }

    public boolean isMatch(String password, String confirmPassword, BindingResult result){
        if(!password.equals(confirmPassword)){
            result.rejectValue("password", "register", "the password and confirm password does not match");
            return false;
        }
        return true;
    }

    public Author isFound(String email, BindingResult result){
        Optional<Author> target = authorRepository.findByEmail(email);
        if(target.isPresent()){
            result.rejectValue("email", "register", "this email is already taken, choose another one");
            return target.get();
        }
        return null;
    }

    public Author createAuthor(Author author){
        String password = BCrypt.hashpw(author.getPassword(), BCrypt.gensalt());
        author.setPassword(password);
        return saveAuthor(author);
    }

}
