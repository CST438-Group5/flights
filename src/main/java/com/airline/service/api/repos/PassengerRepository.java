package com.airline.service.api.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.airline.service.api.entities.Passenger;

@Repository
public interface PassengerRepository extends JpaRepository<Passenger, String> {
	Passenger findByPassengerID(int passengerid);

	@Query(value="SELECT * FROM passenger p WHERE p.firstName=?1 and p.lastName=?2 and p.flightNum=?3", nativeQuery=true)
	Passenger isExist(String firstName, String lastName, String flightNum);
}
