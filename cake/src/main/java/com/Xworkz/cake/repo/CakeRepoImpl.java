package com.Xworkz.cake.repo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.Xworkz.cake.dto.CakeDto;

public class CakeRepoImpl implements CakeRepo {

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("cakeproperties");
	EntityManager entityManager = entityManagerFactory.createEntityManager();

	public boolean save(CakeDto dto) {
		if (entityManager != null) {
			entityManager.getTransaction().begin();
			entityManager.persist(dto);
			entityManager.getTransaction().commit();

			return true;
		}
		return false;

	}

	public CakeDto findById(int id) {
		if (entityManager != null) {
			entityManager.getTransaction().begin();
			CakeDto dto = entityManager.find(CakeDto.class, id);
			entityManager.getTransaction().commit();
			return dto;

		}
		return null;
	}

	public boolean updateNameById(String name, int id) {
		if (entityManager != null) {
			entityManager.getTransaction().begin();
			CakeDto dto = entityManager.find(CakeDto.class, id);
			dto.setFlavourName(name);
			entityManager.merge(dto);
			entityManager.getTransaction().commit();

			return true;
		}
		return false;
	}

	public boolean deleteById(int id) {
		if (entityManager != null) {
			entityManager.getTransaction().begin();
			CakeDto dto=entityManager.find(CakeDto.class, id);
			entityManager.remove(dto);
			entityManager.getTransaction().commit();
		return true;
	}
		return false;
}
}