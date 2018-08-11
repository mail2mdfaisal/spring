package com.jspiders.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jspiders.dto.RegistrationDTO;
@Repository
public class RegistrationDAO {
	@Autowired
	private SessionFactory factory;
	
	public boolean save(RegistrationDTO dto) {
		System.out.println("save method from DAO layer");
		if(dto != null){
			Session session=factory.openSession();
			Transaction tx=session.beginTransaction();
			tx.begin();
			session.save(dto);
			tx.commit();
			return true;
		}else{
			return false;
		}
	}
}
