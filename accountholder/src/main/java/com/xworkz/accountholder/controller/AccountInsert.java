package com.xworkz.accountholder.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.accountholder.entity.AccountHolderEntity;

public class AccountInsert {
	public static void main(String[] args) {

		AccountHolderEntity entity = new AccountHolderEntity("pavan", "nv", "p@gmail.com", 8958366463L, "8/8/2001", 3.5,
				"kadur", 31527028654L, "current", true);
		AccountHolderEntity entity2 = new AccountHolderEntity("kavya", "T", "k@gmail.com", 9620993572L, "23/1/1995", 10,
				"dvg", 45362718372L, "saving", true);
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager manager = factory.createEntityManager();
		System.out.println("database connection established" + factory + manager);
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		manager.persist(entity2);
		transaction.commit();
		manager.close();
	}
}
