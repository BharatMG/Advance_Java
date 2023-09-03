package com.xworkz.accountholder.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.xworkz.accountholder.entity.AccountHolderEntity;

public class FindById {
	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager manager = factory.createEntityManager();
		AccountHolderEntity entity = manager.find(AccountHolderEntity.class, 1);
		System.out.println(entity);

	}

}
