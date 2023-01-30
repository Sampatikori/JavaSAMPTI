package com.Xworkz.specs.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.Xworkz.specs.dto.SpecsDto;

public class SpecsRepoImpl implements SpecsRepo {

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("specsproperties");
	EntityManager em = emf.createEntityManager();

	public boolean create(SpecsDto dto) {
		if (em != null) {
			em.getTransaction().begin();
			em.persist(dto);
			em.getTransaction().commit();
			return true;
		}

		return false;
	}

	public List<SpecsDto> read() {
		if (em != null) {
			em.getTransaction().begin();
			Query query = em.createNamedQuery("read", SpecsDto.class);
			List list = query.getResultList();
			em.getTransaction().commit();
			return list;
		}
		return null;

	}

	public SpecsDto findByShapeAndPrice(String shape, int price) {
		if (em != null) {
			em.getTransaction().begin();
			Query query = em.createNamedQuery("findByShapeAndPrice", SpecsDto.class);
			query.setParameter("sh", shape);

			query.setParameter("pr", price);

			em.getTransaction().commit();
			return (SpecsDto) query.getSingleResult();

		}

		return null;
	}

	public boolean updatePriceByName(int price, String name) {
		if (em != null) {
			em.getTransaction().begin();
			Query query = em.createNamedQuery("updatePriceByName");
			query.setParameter("price", price);
			query.setParameter("name", name);
			query.executeUpdate();
			em.getTransaction().commit();
			return true;

		}
		return false;
	}

	public boolean updateColorByPriceAndShape(String colour, int price, String shape) {
		if (em != null) {
			em.getTransaction().begin();
			Query query = em.createNamedQuery("updateColorByPriceAndShape");
			query.setParameter("colour", colour);
			query.setParameter("price", price);
			query.setParameter("shape", shape);
			query.executeUpdate();
			em.getTransaction().commit();
			return true;

		}
		return false;
	}

	public boolean deleteByPriceAndColor(int price, String colour) {
		if (em != null) {
			em.getTransaction().begin();
			Query query = em.createNamedQuery("deleteByPriceAndColor");
			query.setParameter("pr", price);
			query.setParameter("clr", colour);
			query.executeUpdate();
			em.getTransaction().commit();
			return true;
		
	}
		return false;
}

	public boolean deleteByNameAndId(String name, int id) {
		if (em != null) {
			em.getTransaction().begin();
			Query query = em.createNamedQuery("deleteByNameandId");
			query.setParameter("nm", name);
			query.setParameter("id", id);
			query.executeUpdate();
			em.getTransaction().commit();
			return true;
		}
		return false;
	}
}