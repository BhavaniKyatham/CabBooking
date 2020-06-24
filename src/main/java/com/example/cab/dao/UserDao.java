package com.example.cab.dao;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.cab.model.User;


@Repository
public interface UserDao extends CrudRepository<User, Long>{
	
	public Optional<User> findByUserNameAndPassword(String userName,String password);
	
}
