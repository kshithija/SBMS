package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DBTest implements CommandLineRunner {

	@Autowired
	private DBConnection connection;
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println(connection);
		
	}

}
