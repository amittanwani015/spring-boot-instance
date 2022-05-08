package com.tancor.web.springbootinstance.rest;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tancor.web.springbootinstance.exception.CacheNotFoundException;

@RestController
public class ItemController {

	@RequestMapping("/welcome")
	public String welcomeMessage() throws CacheNotFoundException {
		return "Welcome to Spring Boot Instance";
	}	

	@RequestMapping("/fetchCache")
	public String cacheNotFoundExceptionHandling(@RequestParam(name = "cacheName", required = false) String cacheName)
			throws CacheNotFoundException {
		if(cacheName==null) {
			throw new CacheNotFoundException();
		}
		return HttpStatus.OK.toString();
	}

	@RequestMapping("/missingRequestParam")
	public String missingServletRequestParameterExceptionHandling(@RequestParam("cacheName") 
	String cacheName) {
		return cacheName;
	}
	
}
