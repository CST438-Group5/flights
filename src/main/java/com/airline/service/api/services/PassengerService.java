package com.airline.service.api.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.airline.service.api.entities.Flight;
import com.airline.service.api.entities.Passenger;
import com.airline.service.api.repos.FlightRepository;
import com.airline.service.api.repos.PassengerRepository;

// Service calls unique information from database pertaining to an individual's flight details

@Service
public class PassengerService {

	@Autowired
	FlightRepository flightRepository;
	@Autowired 
	PassengerRepository passengerRepository;
	
	public PassengerService() {
		
	}
	
	public PassengerService(FlightRepository flightRepository, PassengerRepository passengerRepository) {
		this.flightRepository = flightRepository;
		this.passengerRepository = passengerRepository;
	}
	
	// Makes calls to database to assemble a passenger and flight object to wrap into 
	// PassengerInfo object.
	public PassengerInfo getPassengerInfo(int id) {
		Passenger currentPassenger = passengerRepository.findByPassengerID(id);
		Flight currentFlight = flightRepository.findByFlightNum(currentPassenger.getFlightNum());
		return new PassengerInfo(currentPassenger, currentFlight);
	}

	public void saveFlight(Passenger passenger) {
		passengerRepository.save(passenger);
		
	}

	public Passenger isPresent(String firstName, String lastName, String flightNum) {
		
		return passengerRepository.isExist(firstName,  lastName,  flightNum);
	}
	
}
