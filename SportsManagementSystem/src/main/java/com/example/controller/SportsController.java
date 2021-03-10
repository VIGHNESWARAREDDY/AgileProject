package com.example.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.model.LoginModel;
import com.example.model.RegisterModel;

@Controller
public class SportsController {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	@GetMapping("/Menu")
	public String getPage() {
		return "display";
	}
	
	@GetMapping("/registration")
	public String getRegister(@ModelAttribute("reg") @Valid RegisterModel registerModel,BindingResult result) {
		if(result.hasErrors()) {
			return "registration";
		}
		else {
			jdbcTemplate.update("insert into organizer values(?,?,?,?,?,?)",registerModel.getFirstName(),registerModel.getLastName(),registerModel.getGender(),registerModel.getContactNumber(),registerModel.getUserId(),registerModel.getPassword());
			return "display";
		}
	}
	
	
}
