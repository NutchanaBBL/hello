package com.example.demo.test;

import org.springframework.stereotype.Component;

@Component
public class Test {
	
	public void Test1() {
		
		try {
			String xx = "g";
			int x = Integer.valueOf(xx);
			int y = 1;
			int z = y/x;
			
		}catch (Exception e) {
			throw new ApplicationException("Exception!!!"); 
		}	
		System.out.println("aaa");
		System.out.println("bbbbbbbbbbb");
		System.out.println("pig");
	}
	
	

}
