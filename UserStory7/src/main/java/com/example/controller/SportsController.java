package com.example.controller;


	import org.springframework.stereotype.Controller;



	import javax.validation.Valid;

	import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.jdbc.JdbcTemplateAutoConfiguration;
import org.springframework.jdbc.core.JdbcTemplate;
	import org.springframework.stereotype.Controller;
	import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.ModelAttribute;
	import org.springframework.web.bind.annotation.PostMapping;

	import com.example.model.LoginModel.*;
	import com.example.registrationmodel.*;

	@Controller
	public class SportsController {

		@Autowired
		private JdbcTemplate jdbcTemplate;
		@GetMapping("/Menu")
		public String getPage() {
			return "display";
		}
		
		@GetMapping("/registration")
		public String getRegistration(@ModelAttribute("reg") @Valid RegistrationModel registrationModel,BindingResult result) {
			if(result.hasErrors()) {
				return "registration";
			}
			else {
				jdbcTemplate.update("insert into organizer values(?,?,?,?,?,?)",registrationModel.getNameOfEvent(),registrationModel.getSportName(),registrationModel.getDate(),registrationModel.getTime(),registrationModel.getVenue(),registrationModel.getNoOfSlots());
				return "display";
				
			}
			
		}
	}
		
		
	
	




