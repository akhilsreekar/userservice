package com.akhilsreekar.userservice.controllers;

import com.akhilsreekar.userservice.dtos.LoginRequestDto;
import com.akhilsreekar.userservice.dtos.LogoutRequestDto;
import com.akhilsreekar.userservice.dtos.SignUpRequestDto;
import com.akhilsreekar.userservice.dtos.UserDto;
import com.akhilsreekar.userservice.models.Token;
import com.akhilsreekar.userservice.models.User;
import com.akhilsreekar.userservice.services.UserService;
import jakarta.websocket.server.PathParam;
import lombok.extern.java.Log;
import org.antlr.v4.runtime.misc.NotNull;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    private UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }

    @PostMapping("/login")
    public Token login(@RequestBody LoginRequestDto requestDto){
        return userService.login(requestDto.getEmail(),requestDto.getPassword());
    }

    @PostMapping("/signup")
    public UserDto signUp(@RequestBody SignUpRequestDto requestDto){
        String email = requestDto.getEmail();
        String password = requestDto.getPassword();
        String name = requestDto.getName();

        return UserDto.from(userService.signUp(name,email,password));
    }

    @PostMapping("/logout")
    public ResponseEntity<Void> logOut(@RequestBody LogoutRequestDto requestDto){
        userService.logOut(requestDto.getToken());
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PostMapping("/validate/{token}")
    public UserDto validateToken(@PathVariable("token") @NotNull String token){
        return UserDto.from(userService.validateToken(token));
    }
}
