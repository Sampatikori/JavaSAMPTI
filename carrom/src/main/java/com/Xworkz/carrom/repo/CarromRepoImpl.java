package com.Xworkz.carrom.repo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.Xworkz.carrom.dto.CarromDto;

public class CarromRepoImpl implements CarromRepo {
	
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("databaseproperties");
	EntityManager entityManager=entityManagerFactory.createEntityManager();

	public boolean save(CarromDto dto) {
		if(entityManager!=null) {
			entityManager.getTransaction().begin();
			entityManager.persist(dto);
			entityManager.getTransaction().commit();
			return true;
		}
		
		return false;
	}

	public CarromDto findById(int id) {
		if(entityManager!=null) {
			entityManager.getTransaction().begin();
			CarromDto dto=entityManager.find(CarromDto.class, id);
			entityManager.getTransaction().commit();
		return dto;
	}
		return null;

}

	public boolean updateNameById(String name, int id) {
		if(entityManager!=null) {
			entityManager.getTransaction().begin();
			CarromDto dto=entityManager.find(CarromDto.class, id);
			dto.setBrandName(name);
			entityManager.merge(dto);
			entityManager.getTransaction().commit();
		return true;
	}
		return false;
}

	public boolean deleteById(int id) {
		if(entityManager!=null) {
			entityManager.getTransaction().begin();
			CarromDto dto=entityManager.find(CarromDto.class, id);
			entityManager.remove(dto);
			entityManager.getTransaction().commit();
		return true;
	}
	return false;
		
}
}
