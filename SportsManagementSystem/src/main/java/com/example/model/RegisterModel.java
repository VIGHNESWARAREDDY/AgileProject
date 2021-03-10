package com.example.model;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;
import org.springframework.stereotype.Component;

@Component
public class RegisterModel {
	@NotBlank(message="first name is required")
	private String FirstName;
	@NotBlank(message="last name is required")
	private String LastName;
	private String Gender;
	@NotBlank(message="contact number is required")
	@Pattern(regexp="^[7-9]{1}[0-9]{9}",message="Contact number should be ten digits and start with 7/8/9") 
	private String ContactNumber;
	@NotBlank(message="userid is required")
		private String UserId;
	@NotBlank(message="password is required")
	@Pattern(regexp="^[a-zA-Z]{6}[!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>\\/?]*$",message="password should contain 6 letters and many characters")
	private String Password;
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public String getContactNumber() {
		return ContactNumber;
	}
	public void setContactNumber(String contactNumber) {
		ContactNumber = contactNumber;
	}
	public String getUserId() {
		return UserId;
	}
	public void setUserId(String userId) {
		UserId = userId;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	
	
}