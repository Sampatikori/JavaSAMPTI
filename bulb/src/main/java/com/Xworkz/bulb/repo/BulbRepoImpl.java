package com.Xworkz.bulb.repo;

import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NamedQuery;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.Xworkz.bulb.dto.BulbDto;

public class BulbRepoImpl implements BulbRepo {
	
	private EntityManagerFactory emf=Persistence.createEntityManagerFactory("bulbproperties");
	private EntityManager em=emf.createEntityManager();    

	public boolean create(BulbDto dto) {
		if(em!=null) {
			em.getTransaction().begin();
			em.persist(dto);
			em.getTransaction().commit();
			return true;
		}
		return false;
	}

//	public List<BulbDto> readAll() {
//		if(em!=null) {
//			em.getTransaction().begin();
//			TypedQuery<BulbDto> query=em.createQuery("select bulb from BulbDto bulb", BulbDto.class);
//			List list=query.getResultList();
//			
//		return list;
//	}
//		return null;
//	}

	public BulbDto findByName(String name) {
		if(em!=null) {
			em.getTransaction().begin();
		Query query=em.createNamedQuery("bulbname", BulbDto.class);
		query.setParameter("bn", name);
		em.getTransaction().commit();
		return (BulbDto) query.getSingleResult();
		}
		return null;	
		
	}

	public List<BulbDto> readAll() {
		if(em!=null) {
			em.getTransaction().begin();
			Query query=em.createNamedQuery("readAll",BulbDto.class);
			List list=query.getResultList();
			em.getTransaction().commit();
		return list;
	}
		return null;
}
}