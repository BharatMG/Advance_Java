package com.xworkz.accountholder.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.xworkz.accountholder.entity.AccountHolderEntity;

public class FindAll {
	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager manager = factory.createEntityManager();
		Query query = manager.createNamedQuery("findAll");
		List<AccountHolderEntity> list = query.getResultList();
		System.out.println("display the data "+list.toString());
		System.out.println("list of data is:"+list.size());
		manager.close();
	}

}
