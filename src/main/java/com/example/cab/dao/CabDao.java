package com.example.cab.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.cab.model.Cab;
@Repository
public interface CabDao extends CrudRepository<Cab, Integer> {

	public List<Cab> findAll();
}
