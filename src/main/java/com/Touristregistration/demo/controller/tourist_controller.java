package com.Touristregistration.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.Touristregistration.demo.entity.tourist;
import com.Touristregistration.demo.service.tourist_services;

@RestController
public class tourist_controller
{
	
	@Autowired
	public tourist_services tservice;
	
	
	@RequestMapping(method = RequestMethod.POST,value="registerTourist")
	//public void save(@RequestBody tourist tour)
	public tourist savetourist(@RequestBody tourist tour) 
	{
		
		/*String tname= tour.getName();
		//int tp=tempid;
		if(tname != null && !"".equals(tname))
		{
			tourist t =  tservice.fetchTouristByName(tname);
			if(t != null)
			{
				throw new Exception("U have registered allready");
			}
		}*/
		
		tourist t=null;
		t=tservice.savetourist(tour);
		return t;
	}

}
