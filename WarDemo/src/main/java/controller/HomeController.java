package controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping(value="/")
    public String home(){
        return "home";
    }
	
	@GetMapping("/greeting")
	public ResponseEntity<String> greeting() {
		System.out.println("Helllllllllllllll");
		return new ResponseEntity<String>("Welcome", HttpStatus.ACCEPTED);
	}
}
