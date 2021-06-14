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

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		City other = (City) obj;
		if (cityID != other.cityID)
			return false;
		if (cityName == null) {
			if (other.cityName != null)
				return false;
		} else if (!cityName.equals(other.cityName))
			return false;
		if (country == null) {
			if (other.country != null)
				return false;
		} else if (!country.equals(other.country))
			return false;
		return true;
	}

	// Overrides: toString
	@Override
	public String toString() {
		return "City [cityID=" + cityID + ", cityName=" + cityName + ", country=" + country + "]";
	}
	
	
	
	
	
}
