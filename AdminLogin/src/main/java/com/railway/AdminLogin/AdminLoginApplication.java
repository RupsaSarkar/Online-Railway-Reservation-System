package com.railway.AdminLogin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@CrossOrigin(origins = "*")
public class AdminLoginApplication {
	
	@GetMapping("/")
	public String login(){
		return "Hello Admin!" ;
	}


	public static void main(String[] args) {
		SpringApplication.run(AdminLoginApplication.class, args);
	}

}
