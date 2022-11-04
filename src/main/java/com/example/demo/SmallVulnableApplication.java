package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

@SpringBootApplication
public class SmallVulnableApplication {

	public static void main(String[] args) {
		SpringApplication.run(SmallVulnableApplication.class, args);
	}

	@GetMapping("/")
	public String index(@RequestParam(required = false) String param) {
		if (param != null) {
			return "I hope someone does not send malicious code here: " + param;
		}
		return "";
	}

}
