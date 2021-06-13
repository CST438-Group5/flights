package com.airline.service.api.entities;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="city")
public class City {

	@Id
	@Column(name="cityid")
	private int cityID;
	@Column(name="cityname")
	private String cityName;
	@Column(name="country")
	private String country;
	
	public City() {
		// Default constructor
	}
	
	public City(int cityID, String cityName, String country) {
		this.cityID = cityID;
		this.cityName = cityName;
		this.country = country;
	}

	// Setters, getters
	public int getCityID() {
		return cityID;
	}

	public void setCityID(int cityID) {
		this.cityID = cityID;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	// Overrides: toString
	@Override
	public String toString() {
		return "City [cityID=" + cityID + ", cityName=" + cityName + ", country=" + country + "]";
	}
	
	
	
	
	
}
