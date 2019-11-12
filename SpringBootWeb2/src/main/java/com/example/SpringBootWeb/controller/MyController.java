package com.example.SpringBootWeb.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class MyController {

    @GetMapping("/hi")
    public ResponseEntity<String> hi() {
        return new ResponseEntity<>("Hi from rest controller", HttpStatus.ACCEPTED);
    }
    
    @GetMapping("/")
    public String home() {
    	return "home";
    }
}
