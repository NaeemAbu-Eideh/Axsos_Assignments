package com.example.loginregistration.services;

import com.example.loginregistration.models.User;
import com.example.loginregistration.models.UserLogin;
import com.example.loginregistration.repositories.UserRepository;
import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import java.util.Optional;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public User saveUser(User user){
        return userRepository.save(user);
    }

    public User getUserById(Long id){
        Optional<User> user = userRepository.findById(id);
        return user.orElse(null);
    }

    public User getUserByEmail(String email){
        Optional<User> user = userRepository.findByEmail(email);
        return user.orElse(null);
    }

    public User checkUser(User user, UserLogin userLogin, BindingResult result){
        if(user == null){
            result.rejectValue("email", "error.email", "The email is not found");
            return null;
        }

        else if(!user.getEmail().equals(userLogin.getEmail())){
            result.rejectValue("email", "error.email", "email or password is incorrect");
            return null;
        }

        else if(!BCrypt.checkpw(userLogin.getPassword(), user.getPassword())){
            result.rejectValue("email", "error.email", "email or password is incorrect");
            return null;
        }
        return user;
    }
}
