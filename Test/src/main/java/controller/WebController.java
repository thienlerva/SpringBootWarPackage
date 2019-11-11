package controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class WebController {
	
	@RequestMapping("/home")
	public ResponseEntity<String> home() {
		System.out.println("Welcome honme");
		return new ResponseEntity<String>("Welcome", HttpStatus.ACCEPTED);
	}

}
