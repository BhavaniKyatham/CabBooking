package com.example.cab.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.cab.dto.CabDto;
import com.example.cab.service.CabService;

@RestController
public class CabController {

	@Autowired
	CabService cabService;
	
	@GetMapping("/cabs")
	public List<CabDto> getAllCarDetails(){
		return cabService.getAllCarDetails();
		}
}

