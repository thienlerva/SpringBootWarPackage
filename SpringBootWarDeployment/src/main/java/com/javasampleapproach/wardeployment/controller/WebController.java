package com.javasampleapproach.wardeployment.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebController {
	@RequestMapping(value={"/"})
    public String home(){
        return "home";
    }
	
	@RequestMapping("/greeting")
	public ResponseEntity<String> greeting() {
		System.out.println("Helllllllllllllll");
		return new ResponseEntity<String>("Welcome", HttpStatus.ACCEPTED);
	}
}