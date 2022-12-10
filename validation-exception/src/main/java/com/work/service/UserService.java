package com.work.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.work.dto.UserDTO;
import com.work.entity.User;
import com.work.exception.UserNotFoundException;
import com.work.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;

	public User saveUser(UserDTO userDTO) {
		User user = User.builder().name(userDTO.getName()).email(userDTO.getEmail()).mobile(userDTO.getMobile())
				.age(userDTO.getAge()).build();
		return userRepository.save(user);

	}

	public User getUserById(Long id) {
		return userRepository.findById(id).orElseThrow(() -> new UserNotFoundException("no user exist with id " + id));
	}

}
