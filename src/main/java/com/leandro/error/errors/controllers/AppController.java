package com.leandro.error.errors.controllers;

// import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.http.HttpStatus;
// import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.leandro.error.errors.exeptions.UserNotFoundExeption;
import com.leandro.error.errors.models.domain.User;
import com.leandro.error.errors.services.UserService;

@RestController
@RequestMapping("/app")
public class AppController {

    @Autowired
    private UserService service;

    @GetMapping
    public String index() {

        // int volue = 100 / 0;
        int value = Integer.parseInt("10x");
        System.out.println(value);
        return "Ok 200";
    }

    @GetMapping("/show/{id}")
    public User show(@PathVariable Long id) {
        User user = service.findById(id).orElseThrow(() -> new UserNotFoundExeption("Error el usuario no existe!"));

        // Optional<User> optionalUser = service.findById(id);
        // if (optionalUser.isEmpty()) {
        // return ResponseEntity.notFound().build();
        // }
        // System.out.println(user.getLastname());

        // return ResponseEntity.ok(optionalUser.orElseThrow());
        return user;
    }

}
