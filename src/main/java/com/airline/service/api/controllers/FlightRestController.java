package com.airline.service.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.airline.service.api.services.FlightService;

@Controller
public class FlightRestController {
	
	@Autowired
	FlightService flightService;
	

}
