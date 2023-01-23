package com.Xworkz.ac;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.Xworkz.ac.dto.AcConfig;
import com.Xworkz.ac.dto.AcDto;


public class AcRunner {

	public static void main(String[] args) {
		
		AcDto dto = new AcDto(1, "Sony", "20kg", 10000, "White");
		AcDto dto1 = new AcDto(2, "Samsung", "15kg", 15000, "Black");
		AcDto dto2 = new AcDto(3, "Philips", "18kg", 20000, "Red");
		
		Session session = AcConfig.getSessionFactory().openSession(); 
		
		Transaction transaction = session.beginTransaction();
		
//		session.save(dto);
//		session.save(dto1);
//		session.save(dto2);
		
		System.out.println(session.get(AcDto.class, 2));
		
		Criteria criteria = session.createCriteria(AcDto.class);
		List<AcDto> list = criteria.list();
		for (AcDto acDto : list) {
			System.out.println(acDto);
			
		}
		transaction.commit();
		session.close();
		
		

	}

}
