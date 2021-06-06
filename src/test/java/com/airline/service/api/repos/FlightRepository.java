package com.airline.service.api.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.airline.service.api.entities.Flight;

@Repository
public interface FlightRepository extends JpaRepository<Flight, String> {

}
