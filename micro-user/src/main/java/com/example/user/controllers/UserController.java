package com.example.user.controllers;

import com.example.user.model.entities.User;
import com.example.user.model.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.security.RolesAllowed;
import java.util.List;

@RestController
public class UserController {

    private final UserRepository userRepository;

    @Autowired
    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping(value = "/users")
    @RolesAllowed("superadmin")
    public List<User> getAll() {
        return this.userRepository.findAll();
    }
}
