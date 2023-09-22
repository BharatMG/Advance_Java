package com.xworkz.election.repo;

import java.util.List;
import java.util.Properties;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.xworkz.election.dto.ElectionDto;

public class ElectionRepoImpl implements ElectionRepo {
//	Properties props = new Properties();
	

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.xworkz");
//	EntityManager em = emf.createEntityManager();

	
	public boolean save(ElectionDto dto) {
		EntityManager em = emf.createEntityManager();

		if(em!=null) {
			em.getTransaction().begin();
			em.persist(dto);
			em.getTransaction().commit();
			return true;
		}
		return false;
		
	}


//	@Override
//	public List<ElectionDto> readAll() {
//		// TODO Auto-generated method stub
//		return null;
//	}

	public List<ElectionDto> readAll() {
		EntityManager em = emf.createEntityManager();

		if(em!=null) {
	//		em.getTransaction().begin();
			List<ElectionDto> list =  em.createNamedQuery("readAll").getResultList();
	//		list.clear();
	//		em.getTransaction().commit();
			for (ElectionDto electionDto : list) {
				System.out.println(list);
			}
			em.close();
			return list;
	
	}
		return null;
		
	}
}
