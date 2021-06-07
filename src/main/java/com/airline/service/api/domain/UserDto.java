package com.airline.service.api.domain;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.airline.service.api.validation.PasswordMatches;
import com.airline.service.api.validation.ValidEmail;

@PasswordMatches
public class UserDto {

	@ValidEmail
	@NotNull
	@NotEmpty
	private String userEmail;
	
	@NotNull
	@NotEmpty
	private String userPassword;
	private String userMatchingPassword;
	
	// getters/setters
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public String getUserMatchingPassword() {
		return userMatchingPassword;
	}
	public void setUserMatchingPassword(String userMatchingPassword) {
		this.userMatchingPassword = userMatchingPassword;
	}

	
}
