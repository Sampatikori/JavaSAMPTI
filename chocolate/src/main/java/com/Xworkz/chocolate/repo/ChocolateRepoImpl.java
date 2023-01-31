package com.Xworkz.chocolate.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.Xworkz.chocolate.dto.ChocolateDto;

public class ChocolateRepoImpl implements ChocolateRepo {

	private EntityManagerFactory emf = Persistence.createEntityManagerFactory("chocolateproperties");
	private EntityManager em = emf.createEntityManager();

	public boolean create(ChocolateDto dto) {
		if (em != null) {
			em.getTransaction().begin();
			em.persist(dto);
			em.getTransaction().commit();
			return true;
		}
		return false;
	}

	public List<ChocolateDto> readAll() {
		if (em != null) {
			em.getTransaction().begin();
			Query query = em.createNamedQuery("readAll", ChocolateDto.class);
			em.getTransaction().commit();
			return query.getResultList();

		}
		return null;
	}

	public ChocolateDto findByColourAndWeight(String colour, String weight) {
		if (em != null) {
			em.getTransaction().begin();
			Query query = em.createNamedQuery("findByColourAndWeight", ChocolateDto.class);
			query.setParameter("clr", colour);
			query.setParameter("wt", weight);
			em.getTransaction().commit();
			return (ChocolateDto) query.getSingleResult();
		}
		return null;
	}

	public ChocolateDto findByPriceAndname(int price, String name) {
		if (em != null) {
			em.getTransaction().begin();
			Query query = em.createNamedQuery("findByPriceAndname", ChocolateDto.class);
			query.setParameter("price", price);
			query.setParameter("name", name);
			em.getTransaction().commit();
			return (ChocolateDto) query.getSingleResult();
		}
		return null;
	}

	public boolean updateWeightByNameAndColour(String weight, String name, String colour) {
		if (em != null) {
			em.getTransaction().begin();
			Query query = em.createNamedQuery("updateWeightByNameAndColour");
			query.setParameter("wt", weight);
			query.setParameter("name", name);
			query.setParameter("colour", colour);
			query.executeUpdate();
			em.getTransaction().commit();

			return true;
		}

		return false;
	}

	public boolean updateNameByIdAndWeight(String name, int id, String weight) {
		if (em != null) {
			em.getTransaction().begin();
			Query query = em.createNamedQuery("updateNameByIdAndWeight");
			query.setParameter("wt", weight);
			query.setParameter("nm", name);
			query.setParameter("id", id);
			query.executeUpdate();
			em.getTransaction().commit();

			return true;
		}
		return false;
	}

	public boolean deleteByColourAndName(String colour, String name) {
		if (em != null) {
			em.getTransaction().begin();
			Query query = em.createNamedQuery("deleteByColourAndName");
			query.setParameter("nm", name);
			query.setParameter("clr", colour);
			query.executeUpdate();
			em.getTransaction().commit();

			return true;
		}
		return false;
	}

}
