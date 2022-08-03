package com.Touristregistration.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Touristregistration.demo.entity.tourist;
import com.Touristregistration.demo.repository.tourist_repository;

@Service
public class tourist_services
{
	@Autowired
	public tourist_repository trepo;

	public tourist savetourist(tourist tour)
	{
		
		return trepo.save(tour);
	
	}
	

}
