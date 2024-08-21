package com.example.primeNumberIdentifier;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@SpringBootApplication
public class PrimeNumberIdentifierApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrimeNumberIdentifierApplication.class, args);
	}

}
