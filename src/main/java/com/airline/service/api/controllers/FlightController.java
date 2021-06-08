package com.airline.service.api.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.airline.service.api.entities.Flight;
import com.airline.service.api.services.FlightService;

@Controller
public class FlightController {

	private static Logger LOGGER = LoggerFactory.getLogger(FlightController.class.getName());
	@Autowired
	private FlightService flightService;

	public FlightController(FlightService flightService) {
		this.flightService = flightService;
	}

	
	  @RequestMapping(value = "/dd", method = RequestMethod.GET)
	    public String retrieveFlight(Model model) {
	        model.addAttribute("viewFlights", flightService.getAllFlights());

	        return "f";
	    }
	  @PostMapping("/searchFlight")
	    public String searchFlights(@ModelAttribute("flight") Flight flight, Model model) {
		  System.out.println(flight.toString());
		  System.out.println(model.toString());
	        flightService.searchFlightRecords(flight);
	        return "redirect:/flight";
	    }
	   @GetMapping("/showNewFlightForm")
	    public String showNewFlightForm(Model model) {

	        Flight flight= new Flight();
	        model.addAttribute("flight", flight);
	        return "flight";
	    }
}
