package com.akhilsreekar.userservice.controllers;

import com.akhilsreekar.userservice.models.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    public User login(){
        return null;
    }

    public User signUp(){
        return null;
    }

    public ResponseEntity<Void> logOut(){
        return null;
    }
}
