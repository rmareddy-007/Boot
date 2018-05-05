package com.mrsr.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class BootApp {
	
	public static void main(String[] args) {
		SpringApplication.run(BootApp.class, args);
	}

}


@RestController
@RequestMapping("/rest")
class BootAppController{
	
	@GetMapping("/hello")
	public String hello() {
		return "Hello Welcome to First Boot App Programming";
	}
	
	
}