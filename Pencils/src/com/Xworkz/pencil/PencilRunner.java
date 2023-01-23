package com.Xworkz.pencil;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.Xworkz.pencil.config.PencilConfig;
import com.Xworkz.pencil.dto.PencilDto;

public class PencilRunner {
	public static void main(String[] args) {
		
		PencilDto dto=new PencilDto(1,"Apsara",5,"hb","0.5");
		
		Session session = PencilConfig.getSessionFactory().openSession();
		
		Transaction transaction = session.getTransaction();
		
		session.save(dto);
	}

}
