package com.example.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

import org.springframework.stereotype.Component;

@Component
public class LoginModel {

	@NotBlank(message="userid is required")
	private String UserId;
@NotBlank(message="password is required")
@Pattern(regexp="^[a-zA-Z]{6}[!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>\\/?]*$",message="password should contain 6 letters and many characters")
private String Password;
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
