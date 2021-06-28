package com.railway.PassengerLogin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@CrossOrigin(origins = "*")
public class PassengerLoginApplication {
	
	@GetMapping("/")
	public String login(){
		return "Hello Rupsa!" ;
	}

	public static void main(String[] args) {
		SpringApplication.run(PassengerLoginApplication.class, args);
	}

}
