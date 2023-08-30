package com.xworkz.cinema.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.cinema.entity.CinemaEntity;

public class CinemaDelete {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager manager = factory.createEntityManager();
		CinemaEntity find = manager.find(CinemaEntity.class, 2);
		if (find != null) {
			System.out.println(find);
			EntityTransaction transaction = manager.getTransaction();
			transaction.begin();
			System.out.println("removing the id=2 successfully");
			manager.remove(find);
			transaction.commit();
			manager.close();
		} else {
			System.out.println("given id is not valid");
		}
	}
}
