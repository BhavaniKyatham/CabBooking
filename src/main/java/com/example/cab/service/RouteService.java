package com.example.cab.service;


import java.util.List;
import com.example.cab.dto.RouteDto;

public interface RouteService {
	public List<RouteDto> getAllRoutes();

	public RouteDto getRouteById(int routeid);

	public List<RouteDto> getRoutesBySource(String source);

	public List<RouteDto> getRouteByDestination(String destination);

}