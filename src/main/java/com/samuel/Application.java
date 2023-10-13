package com.samuel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class Application {


	@GetMapping("/hello")
	public String hello(){
		return "Hello there my name is samuel";
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
