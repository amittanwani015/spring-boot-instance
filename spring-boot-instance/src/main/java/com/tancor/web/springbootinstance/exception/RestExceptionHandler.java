package com.tancor.web.springbootinstance.exception;

import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

/**
 * 
 * Handling Spring Boot Application Exception from a single point.
 * 
 * @author amitt
 *
 */

@Order(Ordered.HIGHEST_PRECEDENCE)
@ControllerAdvice
public class RestExceptionHandler extends ResponseEntityExceptionHandler{

	/**
	 * Example of CustomExceptionHandling
	 * 
	 * @param cacheNotFoundException
	 * @return
	 */
	@ExceptionHandler(CacheNotFoundException.class)
	protected ResponseEntity<Object> handleCacheNotFound(CacheNotFoundException cacheNotFoundException){
		return new ResponseEntity<>(cacheNotFoundException.getMessage(), HttpStatus.NOT_FOUND);
	}			

	/***
	 * Handling Missing Request Parameter Exception
	 */
	@Override
	protected ResponseEntity<Object> handleMissingServletRequestParameter(MissingServletRequestParameterException ex,
			HttpHeaders headers, HttpStatus status, WebRequest request) {
		return new ResponseEntity<>(ex.getMessage(), HttpStatus.NOT_FOUND);
	}
	
}
