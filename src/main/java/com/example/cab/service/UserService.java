package com.example.cab.service;

import com.example.cab.dto.LoginDto;
import com.example.cab.dto.UserDto;

public interface UserService{
		
		public void addUser(UserDto userDto);
		
		public boolean authenticateUser(LoginDto loginDto);
}




