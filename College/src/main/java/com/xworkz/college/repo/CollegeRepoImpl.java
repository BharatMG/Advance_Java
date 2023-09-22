package com.xworkz.college.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.xworkz.college.dto.CollegeDto;

public class CollegeRepoImpl implements CollegeRepo {

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.xworkz");

	@Override
	public String save(CollegeDto dto) {
		EntityManager em = emf.createEntityManager();
		System.out.println("save method from Repo");
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();
		System.out.println("========Transaction is begin===============");
		em.persist(dto);
		transaction.commit();
		em.close();
		return "data saved successfully";
	}

	@Override
	public List<CollegeDto> readAll() {
		EntityManager em = emf.createEntityManager();
		Query query = em.createNamedQuery("readAll");
		System.out.println("-------reading all data--------");
		List<CollegeDto> read = query.getResultList();
		for (CollegeDto collegeDto : read) {
			System.out.println(collegeDto);
		}
		em.close();
		return read;
	}
}
