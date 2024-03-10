package com.authenticationApp.controllers;


import com.authenticationApp.dtos.LoginUserDto;
import com.authenticationApp.dtos.RegisterUserDto;
import com.authenticationApp.exceptions.CustomAuthenticationException;
import com.authenticationApp.services.AuthService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @Autowired
    private AuthService authService;


    // login user api
    @PostMapping("/login")
    public ResponseEntity<?> authenticateUser(@Valid @RequestBody LoginUserDto loginUserDto){
        System.out.println("----krishna---login user test--");
        try {
            authService.authenticateUser(loginUserDto);
            return ResponseEntity.ok("User authenticated successfully");
        } catch ( CustomAuthenticationException e) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Authentication failed: " + e.getMessage());
        }
    }

    // register user  api
    @PostMapping("/register")
    public ResponseEntity<?> registerUser(@Valid @RequestBody RegisterUserDto registerUserDto) {
        System.out.println("----krishna---register user test-");
        try {
            this.authService.registerUser(registerUserDto);
            return new ResponseEntity<>("User registered successfully !!", HttpStatus.CREATED);
        }
        catch ( CustomAuthenticationException e) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Authentication failed: " + e.getMessage());
        }
    }


}
