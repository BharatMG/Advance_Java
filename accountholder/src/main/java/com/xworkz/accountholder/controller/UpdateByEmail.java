package com.xworkz.accountholder.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import com.xworkz.accountholder.entity.AccountHolderEntity;

public class UpdateByEmail {

	public static void main(String[] args) {

		String email = "g@gmail.com";
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager manager = factory.createEntityManager();
		Query query = manager.createNamedQuery("findByEmail");
		query.setParameter("name", email);
		List<AccountHolderEntity> list = query.getResultList();
		System.out.println(list.toString());
		System.out.println(list.size());
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();

		for (AccountHolderEntity accountHolderEntity : list) {
			System.out.println(accountHolderEntity.getFirstName());			
			accountHolderEntity.setFirstName("bujji");
			manager.merge(accountHolderEntity);
			System.out.println("After changing the Name " +accountHolderEntity);
			transaction.commit();
			manager.close();
		}
	}
}
