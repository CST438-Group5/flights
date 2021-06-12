package com.airline.service.api.services;

import com.airline.service.api.entities.Flight;
import com.airline.service.api.entities.Passenger;

// Contains information about a passenger and their corresponding flight.
// Integral object for the REST API
public class PassengerInfo {

	public Passenger passenger;
	public Flight flight;
	
	public PassengerInfo() {
		
	}
	
	public PassengerInfo(Passenger passenger, Flight flight) {
		this.passenger = passenger;
		this.flight = flight;
	}

	// To string overrides
	@Override
	public String toString() {
		return "PassengerInfo [passenger=" + passenger + ", flight=" + flight + "]";
	}
	
	
	
}
