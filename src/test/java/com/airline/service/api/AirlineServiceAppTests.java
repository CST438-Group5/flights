package com.airline.service.api;

import java.util.TimeZone;

import javax.annotation.PostConstruct;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AirlineServiceAppTests {

	@PostConstruct
	void started() {
	    TimeZone.setDefault(TimeZone.getTimeZone("Etc/UTC"));
	}
	
	@Test
	void contextLoads() {
	}

}
