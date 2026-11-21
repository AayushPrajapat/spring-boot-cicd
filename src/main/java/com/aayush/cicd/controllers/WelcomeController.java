package com.aayush.cicd.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/welcome")
public class WelcomeController {

    @RequestMapping
    public ResponseEntity<String> welcome() {
        return ResponseEntity.ok("Welcome to the Spring Boot API with learning CICD..!!");
    }
}
