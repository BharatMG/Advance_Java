package com.xworkz.airpods.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.xworkz.airpods.dto.AirpodsDto;

public class AirpodRepoImpl implements AirpodsRepo {

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.xworkz");
	EntityManager em = emf.createEntityManager();

	public boolean store(AirpodsDto dto) {

		// AirpodsDto dto = new AirpodsDto();
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();
		em.persist(dto);
		transaction.commit();
		em.close();
		return true;

	}

	public boolean updateColorByName(String color, String name) {
//		EntityManager em = emf.createEntityManager();
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();
		Query query = em.createNamedQuery("updateColorbyName");

		query.setParameter("col", color);
		query.setParameter("nm", name);
		int update = query.executeUpdate();
		transaction.commit();
		em.close();
		return true;
	}

	public boolean deleteByPrice(int price) {
		if(em!=null) {
			em.getTransaction().begin();
			Query query = em.createNamedQuery("deleteByPrice");
			query.setParameter("pr", price);
			int delete =query.executeUpdate();
			em.getTransaction().commit();
			em.close();
			return true;
			
		}
		return false;
	}

//
//
	public AirpodsDto readAll() {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		Query query = em.createNamedQuery("readAll");
		List list = query.getResultList();
		System.out.println(list.toString());
		System.out.println(list.size());
		return null;
	}

}
