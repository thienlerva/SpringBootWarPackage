package com.example.SpringBootWeb.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

@Controller
public class HomeController {

    private final AtomicInteger counter = new AtomicInteger(0);

    @GetMapping("/home")
    public ResponseEntity<String> home() {
        return new ResponseEntity<>("Welcome Home", HttpStatus.ACCEPTED);
    }

    @GetMapping("/counter")
    public String myView(Map<String, Integer> model) {
        counter.set(counter.get() + 1);
        model.put("counter", counter.get());
        return "view-page";
    }
}
