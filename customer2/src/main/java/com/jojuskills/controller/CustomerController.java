package com.jojuskills.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("customer")
public class CustomerController {
	
	@GetMapping("/getCustomer")
	public ResponseEntity<String> getCustomerName(){
		return ResponseEntity.ok().body("Anudip Customer Service!!!!");
	}

}

