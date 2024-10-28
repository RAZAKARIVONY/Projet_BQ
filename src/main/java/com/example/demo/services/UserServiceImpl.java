package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.example.demo.dto.UserDto;
import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;

public class UserServiceImpl implements UserService {

	 @Autowired
	 PasswordEncoder passwordEncoder;

	 private UserRepository userRepository;

	 public UserServiceImpl(UserRepository userRepository) {
	  super();
	  this.userRepository = userRepository;
	 }

	 @Override
	 public User findByUsername(String username) {
	  return userRepository.findByUsername(username);
	 }

	 @Override
	 public User save(UserDto userDto) {
	  User user = new User(userDto.getUsername(), passwordEncoder.encode(userDto.getPassword()),
	    userDto.getFullname());
	  return userRepository.save(user);
	 }

	}
