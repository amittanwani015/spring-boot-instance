package com.tancor.web.springbootinstance.exception;

public class CacheNotFoundException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public CacheNotFoundException() {
		super("CACHE NOT FOUND FOR THE REQUIRED CONTEXT PARAMETERS");
	}
	
}
