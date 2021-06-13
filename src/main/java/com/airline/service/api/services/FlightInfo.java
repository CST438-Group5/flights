package com.airline.service.api.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.airline.service.api.entities.Airline;
import com.airline.service.api.entities.City;
import com.airline.service.api.entities.Flight;

public class FlightInfo {

	private static Logger LOGGER = LoggerFactory.getLogger(FlightInfo.class.getName());
	
	public Flight flight;
	public Airline airline;
	public City originCity;
	public City destCity;

	public FlightInfo() {
		
	}
	
	public FlightInfo(Flight flight, Airline airline, City originCity, City destCity) {
		LOGGER.info("***INITIALIZING FlightInfo object***");
		this.flight = flight;
		this.airline = airline;
		this.originCity = originCity;
		this.destCity = destCity;
	}

	@Override
	public String toString() {
		return "FlightInfo [flight=" + flight + ", airline=" + airline + ", originCity=" + originCity + ", destCity="
				+ destCity + "]";
	}
	
}
