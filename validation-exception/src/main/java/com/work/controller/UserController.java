package com.work.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.work.dto.UserDTO;
import com.work.entity.User;
import com.work.service.UserService;

import jakarta.validation.Valid;

@RestController
public class UserController {

	@Autowired
	private UserService userService;

	@PostMapping(path = "/users")
	public ResponseEntity<User> saveUser(@RequestBody @Valid UserDTO userDTO) {
		return new ResponseEntity<>(userService.saveUser(userDTO), HttpStatus.CREATED);
	}

	@GetMapping(path = "/users/{id}")
	public ResponseEntity<User> getUserById(@PathVariable Long id) {
		return ResponseEntity.ok().body(userService.getUserById(id));
	}

}
