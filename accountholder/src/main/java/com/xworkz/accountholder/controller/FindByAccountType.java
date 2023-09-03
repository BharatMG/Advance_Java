package com.xworkz.accountholder.controller;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.xworkz.accountholder.entity.AccountHolderEntity;

public class FindByAccountType {
	public static void main(String[] args) {
		String accountType="current";
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager manager = factory.createEntityManager();
		Query query = manager.createNamedQuery("findByAccountType");
		query.setParameter("name", accountType);
		List<AccountHolderEntity> list = query.getResultList();
		System.out.println(list.toString());
		System.out.println(list.size());
		manager.close();

	}

}
