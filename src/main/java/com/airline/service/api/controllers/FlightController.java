package com.airline.service.api.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;

import com.airline.service.api.domain.UserDto;
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

	  @RequestMapping(value = "/", method = RequestMethod.GET)
	    public String retrieveFlight(Model model) {
	        model.addAttribute("viewFlights", flightService.getAllFlights());

	        return "index";
	    }
	  
	   @GetMapping("/showNewFlightForm")
	    public String showNewFlightForm(Model model) {

	        Flight flight= new Flight();
	        model.addAttribute("flight", flight);
	        return "index";
	    }
	   
	   @GetMapping("/signup.html")
	   public String showRegistrationForm(WebRequest request, Model model) {
		   UserDto userDto = new UserDto();
		   model.addAttribute("user", userDto);
		   return "signup";
	   }
	   
	   // TODO: ~In Progress~
	   @PostMapping("/signup.html")
	   public ModelAndView registerUserAccount(
			   @ModelAtribute("user") @Valid UserDto userDto,
			   HttpServletRequest request,
			   Errors errors) {
		   			
		   		try {
		   			User registered = userService.registerNewUserAccount(userDto);
		   		} catch (UserAlreadyExistException uaeEx){
		   			mav.addObject("message", "An account for that email address already exists!");
		   			return mav;
		   		}
	   }
}
