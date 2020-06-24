package com.example.cab.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.cab.dao.CabDao;
import com.example.cab.dto.CabDto;
import com.example.cab.model.Cab;
import com.example.cab.service.CabService;

@Service
public class CabServiceImpl implements CabService{

	@Autowired
	CabDao cabDao;
	
	@Override
	public List<CabDto> getAllCarDetails() {

		List<Cab> cabs= cabDao.findAll();
		List<CabDto> cabDtoList=new ArrayList<CabDto>();
		cabs.forEach(cab->cabDtoList.add(getCabDto(cabs)));
		return cabDtoList;
	}

	private CabDto getCabDto(List<Cab> cabs) {
		CabDto cabDto=new CabDto();
		   BeanUtils.copyProperties(cabs, cabDto);
			return cabDto;
	}

	
}
