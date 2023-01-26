package com.Xworkz.biscuit;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.Xworkz.biscuit.dto.BiscuitDto;

public class BiscuitRunner {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("sep_08Properties");

		EntityManager entityManager = entityManagerFactory.createEntityManager();

		entityManager.getTransaction().begin();

		BiscuitDto dto = new BiscuitDto(1, "Parle-G", 5, "Human", true);
		BiscuitDto dto1 = new BiscuitDto(2, "HappyHappy", 5, "Human", true);
		BiscuitDto dto2 = new BiscuitDto(3, "Pedigree", 50, "Dog", false);
		BiscuitDto dto3 = new BiscuitDto(4, "Goodday", 10, "Human", true);
		BiscuitDto dto4 = new BiscuitDto(5, "Marigold", 10, "Human", false);
		BiscuitDto dto5 = new BiscuitDto(6, "Dark-fanatasy", 50, "Human", true);
		BiscuitDto dto6 = new BiscuitDto(7, "Sunfeast", 15, "Human", true);
		BiscuitDto dto7 = new BiscuitDto(8, "Chip-chops", 20, "dog", false);
		BiscuitDto dto8 = new BiscuitDto(9, "Bark out", 30, "dog", false);
		BiscuitDto dto9 = new BiscuitDto(10, "Drools", 50, "dog", false);
		BiscuitDto dto10 = new BiscuitDto(11, "Mari lite", 10, "Human", true);

//		entityManager.persist(dto);
//		entityManager.persist(dto1);
//		entityManager.persist(dto2);
//		entityManager.persist(dto3);
//		entityManager.persist(dto4);
//		entityManager.persist(dto5);
//		entityManager.persist(dto6);
//		entityManager.persist(dto7);
//		entityManager.persist(dto8);
//		entityManager.persist(dto9);
//		entityManager.persist(dto10);

//		dto5.setName("Bounce");
//		BiscuitDto dtos = entityManager.merge(dto5);
//
		BiscuitDto dt = entityManager.find(BiscuitDto.class, 9);
		
//		System.out.println(dt);
		
		entityManager.remove(dt);
		

		entityManager.getTransaction().commit();

	}

}
