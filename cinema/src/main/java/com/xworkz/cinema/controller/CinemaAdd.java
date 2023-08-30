package com.xworkz.cinema.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import com.xworkz.cinema.entity.CinemaEntity;

public class CinemaAdd {
	
	public static void main(String[] args) {
		
		CinemaEntity entity = new CinemaEntity("kgf-2","prashant Neel","hombale","basrur","yash","sriNidhi","ganesh",100,5,300);
		CinemaEntity entity2= new CinemaEntity("Paramatma","Batru","MRP films","harikrishna","puneeth","deepa","ganesh",30,6,250);
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz");
		System.out.println("connection established"+factory);
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		manager.persist(entity);
		manager.persist(entity2);
		transaction.commit();
		manager.close();

	}
}
