package com.Xworkz.pencil;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;

import org.hibernate.Criteria;
import org.hibernate.Session;

import org.hibernate.Transaction;
import org.hibernate.internal.CriteriaImpl;
import org.hibernate.internal.CriteriaImpl.CriterionEntry;
import org.hibernate.loader.criteria.CriteriaLoader;
import org.hibernate.loader.criteria.CriteriaQueryTranslator;
import org.hibernate.query.criteria.internal.CriteriaBuilderImpl;
import org.hibernate.query.criteria.internal.CriteriaQueryImpl;
import org.hibernate.query.criteria.internal.compile.CriteriaCompiler;

import com.Xworkz.pencil.config.PencilConfig;
import com.Xworkz.pencil.dto.PencilDto;

public class PencilRunner {
	public static void main(String[] args) {
		
		PencilDto dto=new PencilDto(1,"Apsara",5,"hb","0.5");
		PencilDto dto1=new PencilDto(2,"Doms",5,"hb","1.0");
		
		Session session = PencilConfig.getSessionFactory().openSession();
		
		Transaction transaction = session.beginTransaction();
		
//		session.save(dto);
//		session.save(dto1);
		System.out.println(session.get(PencilDto.class, 1));
		System.out.println(session.get(PencilDto.class, 2));
		
	    Criteria criteria = session.createCriteria(PencilDto.class);
	    List<PencilDto> list = criteria.list();
	    for (PencilDto pencilDto : list) {
			System.out.println(pencilDto);
		}
//	    System.out.println(list);
		
		transaction.commit();
		session.close();
		
		
	}

}
