package com.example.SpringBootWeb.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @GetMapping("/hi")
    public String hi() {
        return "Hi from rest controller";
    }
}
