package com.example.cab.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.cab.dao.RouteDao;
import com.example.cab.dto.RouteDto;
import com.example.cab.model.Route;
import com.example.cab.service.RouteService;


@Service
public class RouteServiceImpl implements RouteService{

	@Autowired
	RouteDao routeDao;
	
	@Override
	public List<RouteDto> getAllRoutes() {
		List<Route> routes= routeDao.findAll();
		List<RouteDto> routeDtoList=new ArrayList<RouteDto>();
		routes.forEach(route->routeDtoList.add(getRouteDto(route)));
		return routeDtoList;
	}
	private RouteDto getRouteDto(Route route) {
		RouteDto routeDto=new RouteDto();
	   BeanUtils.copyProperties(route, routeDto); 
		return routeDto;
	}
	@Override
	public RouteDto getRouteById(int routeid) {
		Optional<Route> routeOptional = routeDao.findById(routeid);
		RouteDto routeDto=new RouteDto();
		if(routeOptional.isPresent()) {
			BeanUtils.copyProperties(routeOptional.get(), routeDto);
			return routeDto;
		}		
		return routeDto;
	}
	@Override
	public List<RouteDto> getRoutesBySource(String source) {
		List<RouteDto> routeDtoList = new ArrayList<RouteDto>();
		Optional<List<Route>> routes = routeDao.getRoutesBySource(source);
		if(routes.isPresent())
		return routes.get().stream().map(route->getRouteDto(route)).collect(Collectors.toList());
		else {
			return routeDtoList;
		}
	}
	@Override
	public List<RouteDto> getRouteByDestination(String destination) {
		List<RouteDto> routeDtoList = new ArrayList<RouteDto>();
		Optional<List<Route>> routes = routeDao.getRouteByDestination(destination);
		if(routes.isPresent())
		return routes.get().stream().map(route->getRouteDto(route)).collect(Collectors.toList());
		else {
			return routeDtoList;
		}
	}
}

