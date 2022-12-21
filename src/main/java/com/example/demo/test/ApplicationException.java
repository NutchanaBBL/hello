package com.example.demo.test;

import org.springframework.stereotype.Component;

@Component
public class ApplicationException extends RuntimeException {
   
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ApplicationException() {}
	
	public ApplicationException(String msg) {
		super(msg);
		System.out.println("ffff");
	}
	
	
	
}