package com.xworkz.cinema.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.cinema.entity.CinemaEntity;

public class CinemaSearch {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager manager = factory.createEntityManager();
		CinemaEntity entity = manager.find(CinemaEntity.class, 1);
		
		if (entity!=null) {
		System.out.println(entity);
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		entity.setDirector("santosh");
		entity.setHero("Appu");
		System.out.println(entity);
		manager.merge(entity);
		transaction.commit();
		manager.close();
		}else {
			System.out.println("invalid entity data is null");
		}
	}
}
