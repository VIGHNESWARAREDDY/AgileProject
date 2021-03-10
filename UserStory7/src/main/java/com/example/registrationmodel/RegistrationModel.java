package com.example.registrationmodel;

import javax.validation.constraints.NotBlank;

import org.springframework.lang.NonNull;
import org.springframework.stereotype.Component;

@Component
public class RegistrationModel {
	@NotBlank(message="nameOfEvent is required")
	private String nameOfEvent;
	@NotBlank(message=" sportName is required")
	private String sportName;
	@NotBlank(message=" date is required")
	private int date;
	@NotBlank(message=" time is required")
	private int time;
	@NotBlank(message=" venue is required")
	private String venue;
	@NotBlank(message=" noOfSlots is required")
	private int noOfSlots;
	
	public String getNameOfEvent() {
		return nameOfEvent;
	}
	public void setNameOfEvent(String nameOfEvent) {
		this.nameOfEvent = nameOfEvent;
	}
	public String getSportName() {
		return sportName;
	}
	public void setSportName(String sportName) {
		this.sportName = sportName;
	}
	public int getDate() {
		return date;
	}
	public void setDate(int date) {
		this.date = date;
	}
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	public String getVenue() {
		return venue;
	}
	public void setVenue(String venue) {
		this.venue = venue;
	}
	public int getNoOfSlots() {
		return noOfSlots;
	}
	public void setNoOfSlots(int noOfSlots) {
		this.noOfSlots = noOfSlots;
	}
	
	

}
