package com.example.cab.service.impl;

import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import com.example.cab.dao.UserDao;
import com.example.cab.dto.LoginDto;
import com.example.cab.dto.UserDto;
import com.example.cab.model.User;
import com.example.cab.service.UserService;


@Service
public class UserServiceImpl implements UserService  {
	@Autowired
	UserDao userDao;
	
	@Override
	public void addUser(@RequestBody UserDto userDto)
	{
		User user = new User();
		BeanUtils.copyProperties(userDto, user);
		userDao.save(user);
	}
	
	@Override
	public boolean authenticateUser(LoginDto loginDto)
	{
		Optional<User> user = userDao.findByUserNameAndPassword(loginDto.getUserName(),loginDto.getPassword());
		if(user.equals(null))
			return false;
		else {
			return true;
		}
		
}
		
}

