package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.demo.test.ApplicationException;
import com.example.demo.test.Test;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		System.out.println("Spring Start");

		SpringApplication.run(DemoApplication.class, args);

		System.out.println("Spring Finish");

	}

	@Override
	public void run(String... args) throws ApplicationException {
		System.out.println("EXECUTING : command line runner");
		Test test = new Test();
		test.Test1();
	}
	
//	@Bean
//	public CommandLineRunner commandLineRunner() {
//	  return args -> {
//	    System.exit(
//	      SpringApplication.exit(applicationContext, () -> 11));
//	  };
//	}

}
