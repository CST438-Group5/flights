package com.airline.service.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.airline.service.api.services.PassengerInfo;
import com.airline.service.api.services.PassengerService;

// Controller returns flights & passengers table as JSON
@RestController
public class PassengerRestController {
	
	@Autowired
	private PassengerService passengerService;
	
	@GetMapping("/api/flights/passenger/{id}")
	public PassengerInfo getPassengerInfo(@PathVariable("id") int idInfo) {
		PassengerInfo passengerInfo = passengerService.getPassengerInfo(idInfo);
		System.out.println(passengerInfo);
		return passengerInfo;
	}

}
