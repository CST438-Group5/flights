package com.airline.service.api.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="passenger")
public class Passenger {

	@Id
	@Column(name="passengerid")
	private int passengerID;
	@Column(name="firstname")
	private String firstName;
	@Column (name="lastname")
	private String lastName;
	@Column (name="seatnum")
	private String seatNum;
	@Column (name="flightnum")
	private String flightNum;
	@Column (name="class")
	private int seatClass;
	
	public Passenger() { 
		// Default constructor
	}
	
	public Passenger(int passengerID, String firstName, String lastName, String seatNum, String flightNum,
			int seatClass) {
		super();
		this.passengerID = passengerID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.seatNum = seatNum;
		this.flightNum = flightNum;
		this.seatClass = seatClass;
	}

	// Setters, getters
	public int getPassengerID() {
		return passengerID;
	}

	public void setPassengerID(int passengerID) {
		this.passengerID = passengerID;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getSeatNum() {
		return seatNum;
	}

	public void setSeatNum(String seatNum) {
		this.seatNum = seatNum;
	}

	public String getFlightNum() {
		return flightNum;
	}

	public void setFlightNum(String flightNum) {
		this.flightNum = flightNum;
	}

	public int getSeatClass() {
		return seatClass;
	}

	public void setSeatClass(int seatClass) {
		this.seatClass = seatClass;
	}

	// Custom toString
	@Override
	public String toString() {
		return "Passenger [passengerID=" + passengerID + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", seatNum=" + seatNum + ", flightNum=" + flightNum + ", seatClass=" + seatClass + "]";
	}

	

}

