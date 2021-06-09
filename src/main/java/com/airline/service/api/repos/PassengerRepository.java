package com.airline.service.api.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.airline.service.api.entities.Passenger;

@Repository
public interface PassengerRepository extends JpaRepository<Passenger, String> {
	Passenger findByPassengerID(int passengerid);
}
