package com.jspiders.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.jspiders.dto.RegistrationDTO;
import com.jspiders.service.RegistrationService;

@Controller
public class RegistrationController {
	@Autowired
	private RegistrationService service;
	
	@RequestMapping(value="/",method=RequestMethod.GET)
	public String homePage(){
		System.out.println("homepage method called");
		return ViewFileNames.HOME_PAGE;
	}
	
	@RequestMapping(value="register",method=RequestMethod.POST)
	public String register(@ModelAttribute RegistrationDTO dto){
		System.out.println("register method invoked");
		System.out.println(dto);
		boolean saved=service.isSaved(dto);
		if(saved)
			return ViewFileNames.WELCOME_PAGE;
		else
			return ViewFileNames.ERROR_PAGE; 
	}
}
