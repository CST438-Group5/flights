package com.airline.service.api.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.airline.service.api.services.FlightInfo;
import com.airline.service.api.services.FlightService;

@RestController
public class FlightRestController {
	
	private static Logger LOGGER = LoggerFactory.getLogger(FlightRestController.class.getName());
	
	@Autowired
	private FlightService flightService;
	
	@GetMapping("/api/flights/flight/{id}")
	public FlightInfo getFlightInfo(@PathVariable("id") String idInfo) {
		FlightInfo flightInfo = flightService.getFlightById(idInfo);
		System.out.println(flightInfo);
		return flightInfo;
	}

}
