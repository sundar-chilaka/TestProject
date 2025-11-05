package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api")
@RestController
public class TestController {
	
	//http://localhost:8080/api/wish
	@GetMapping("/wish")
	public ResponseEntity<String> wish(){
		String msg = "Hello";
		return new ResponseEntity<>(msg,HttpStatus.OK);
	}
	
	//http://localhost:8080/api
	@GetMapping
	public String massage() {
		return "Hello this is Controller......!";
	}
	
	@GetMapping("/sayHi")
	public ResponseEntity<String> sayHi(){
		String msg = "Hello ..........";
		return new ResponseEntity<>(msg,HttpStatus.OK);
	}
}
