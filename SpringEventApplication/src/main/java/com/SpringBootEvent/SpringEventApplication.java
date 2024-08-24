package com.SpringBootEvent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.SpringBootEvent.Repositary.EventRepositary;

@SpringBootApplication
public class SpringEventApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringEventApplication.class, args);
	}

	@Autowired
	private EventRepositary repo;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		
		
	}

}
