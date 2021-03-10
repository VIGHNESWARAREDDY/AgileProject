package com.example.model;

import javax.validation.constraints.NotBlank;

import org.springframework.stereotype.Component;

@Component
public class LoginModel {
	@NotBlank(message="nameOfEvent is required")
	private String NameOfEvent;
	@NotBlank(message=" sportName is required")
	private String SportName;
	@NotBlank(message=" date is required")
	private int Date;
	@NotBlank(message=" time is required")
	private int Time;
	@NotBlank(message=" venue is required")
	private String Venue;
	@NotBlank(message=" noOfSlots is required")
	private int noOfSlots;

public String getNameOfEvent() {
		return NameOfEvent ;
}
public void setNameOfEvent(String nameOfEvent) {
	NameOfEvent = nameOfEvent;
}

public String getSportName() {
		return SportName ;
}
public void setSportName(String sportName) {
	SportName = sportName;
}
public int getDate() {
	return Date ;
}
public void setDate(int date) {
	Date = date;
}
public int getTime() {
	return Time ;
}
public void setTime(int time) {
	Time = time;
}
public String getVenue() {
	return Venue ;
}
public void setVenue(String venue) {
	Venue = venue;
}





	
}
	
	
	
