package com.airline.service.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.airline.service.api.entities.Passenger;
import com.airline.service.api.repos.PassengerRepository;
import com.airline.service.api.services.PassengerInfo;
import com.airline.service.api.services.PassengerService;

// Controller returns flights & passengers table as JSON
@RestController
public class PassengerRestController {
	
	private PassengerRepository passengerRepository;
	
	@Autowired
	private PassengerService passengerService;
	
	@GetMapping("/api/flights/passenger/{id}")
	public PassengerInfo getPassengerInfo(@PathVariable("id") int idInfo) {
		PassengerInfo passengerInfo = passengerService.getPassengerInfo(idInfo);
		return passengerInfo;
	}
	
	@PostMapping("/api/flights/passenger/")
	ResponseEntity<String> newPassenger(@RequestBody Passenger newPassenger) {
		HttpHeaders responseHeaders = new HttpHeaders();
		passengerRepository.save(newPassenger);
		
		return new ResponseEntity<>(
			      "New passenger added", responseHeaders, HttpStatus.OK);
	}
	
	@DeleteMapping("/api/flights/passenger/{id}")
	public String deletePassenger(@PathVariable("id") int idInfo) {
		Passenger passenger = passengerRepository.findByPassengerID(idInfo);
		
		passengerRepository.delete(passenger);
		
		return "Passenger deleted";
	}


}
