package com.airline.service.api.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.airline.service.api.entities.City;

public interface CityRepository extends JpaRepository<City, String> {
	
	City findByCityID(int cityid);

}
