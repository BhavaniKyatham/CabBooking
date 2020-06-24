package com.example.cab.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.cab.model.Route;


@Repository
public interface RouteDao extends CrudRepository<Route, Integer>{

	public List<Route> findAll();

	public Optional<List<Route>> getRoutesBySource(String source);

	public Optional<List<Route>> getRouteByDestination(String destination);

}
