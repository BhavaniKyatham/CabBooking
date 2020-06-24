package com.example.cab.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.cab.dto.RouteDto;
import com.example.cab.service.RouteService;

@RestController
public class RouteController {

	@Autowired
	RouteService routeService; 
	
	@GetMapping("/routes")
	public List<RouteDto> getAllRoutes(){
		return routeService.getAllRoutes();
	}
	
	@GetMapping("/routes/{routeid}")
	public RouteDto getRouteById(@PathVariable int routeid){
		return routeService.getRouteById(routeid);		
	}
	
	@GetMapping("/routes/source")
	public List<RouteDto> getRoutesBySource(@RequestParam("source") String source){
		return routeService.getRoutesBySource(source);
	}
	
	@GetMapping("/routes/destination")
	public List<RouteDto> getRoutesByDestination(@RequestParam("destination")String destination){
		return routeService.getRouteByDestination(destination);
	}
}
