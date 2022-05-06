package com.tancor.web.springbootinstance.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ItemController {
	
	@RequestMapping("/welcome")
	public String welcomeMessage() {
		return "Welcome to Spring Boot Instance";
	}	
}
