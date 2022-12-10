package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.service.CalcService;

@RestController
public class CalcController {

	@Autowired
	private CalcService calcService;

	@GetMapping("/calc/{a}/{b}")
	public int calcSum(@PathVariable int a, @PathVariable int b) {
		return calcService.testAdd(a, b);
	}

}
