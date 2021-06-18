package com.airline.service.api.services;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.airline.service.api.repos.FlightRepository;
import com.airline.service.api.repos.PassengerRepository;

@SpringBootTest
public class PassengerServiceTest {

	@MockBean
	FlightRepository flightRepository;
	@MockBean 
	PassengerRepository passengerRepository;
	
	private PassengerService passengerService;
	
	@BeforeEach
	public void setUp() {
		MockitoAnnotations.openMocks(this);
	}
	
	@Test
	public void getPassengerInfoTest() {
		
	}
	
}
