package com.jspiders.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jspiders.dao.RegistrationDAO;
import com.jspiders.dto.RegistrationDTO;
@Service
public class RegistrationService {
	@Autowired
	private RegistrationDAO dao;
	
	public boolean isSaved(RegistrationDTO dto){
		System.out.println("isSaved method called from RegistrationService class");
		boolean isSaved=dao.save(dto);
		return isSaved;
	}

}
