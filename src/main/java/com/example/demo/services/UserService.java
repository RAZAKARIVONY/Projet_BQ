package com.example.demo.services;

import com.example.demo.dto.UserDto;
import com.example.demo.entity.User;

public interface UserService {

	User findByUsername(String username);

	 User save(UserDto userDto);
	
}
