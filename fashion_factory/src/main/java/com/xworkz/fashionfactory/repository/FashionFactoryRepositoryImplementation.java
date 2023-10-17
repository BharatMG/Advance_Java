package com.xworkz.fashionfactory.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.fashionfactory.dto.FashionFactoryDTO;
import com.xworkz.fashionfactory.entity.FashionFactoryEntity;

@Repository
public class FashionFactoryRepositoryImplementation implements FashionFactoryRepository {

	public FashionFactoryRepositoryImplementation() {
		System.out.println("FashionFactoryRepositoryImplementation constructor");
	}

	@Autowired
	public EntityManagerFactory factory;

	@Override
	public boolean onSave(FashionFactoryDTO dto) {
		System.out.println("onSave method in repository");
		EntityManager manager = factory.createEntityManager();

		FashionFactoryEntity entity = new FashionFactoryEntity();
		BeanUtils.copyProperties(dto, entity);
		manager.getTransaction().begin();
		manager.persist(entity);
		manager.getTransaction().commit();
		manager.close();
		return true;
	}

	@Override
	public List<FashionFactoryEntity> readAll() {
		EntityManager manager = factory.createEntityManager();
		System.out.println("readAll method in repository");
		Query query = manager.createNamedQuery("readAll");
		List<FashionFactoryEntity> list = query.getResultList();
		System.out.println(list);
		return list;
	}

	@Override
	public FashionFactoryEntity findById(int id) {
		System.out.println("finfById meyhod in repository" + id);
		EntityManager manager = factory.createEntityManager();
		FashionFactoryEntity entity = manager.find(FashionFactoryEntity.class, id);
		return entity;
	}

	@Override
	public List<FashionFactoryEntity> findByEmail(String emailId) {
		System.out.println("findByEmail method in repository");
		EntityManager manager = factory.createEntityManager();
		Query query = manager.createNamedQuery("readByEmail");
		query.setParameter("email", emailId);
		List<FashionFactoryEntity> entities = query.getResultList();
		return entities;
	}

	@Override
	public boolean deleteById(int id) {
		System.out.println("deleteById method");
		EntityManager manager = factory.createEntityManager();
		FashionFactoryEntity entity = manager.find(FashionFactoryEntity.class, id);
		if (entity != null) {
			manager.getTransaction().begin();
			manager.remove(entity);
			manager.getTransaction().commit();
			manager.close();
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean updateById(FashionFactoryDTO dto) {
		System.out.println("updateById method in repository");
		EntityManager manager = factory.createEntityManager();
		FashionFactoryEntity entity = new FashionFactoryEntity();
		manager.getTransaction().begin();
		BeanUtils.copyProperties(dto, entity);
		manager.merge(entity);
		manager.getTransaction().commit();
		manager.close();
		return true;
	}

	@Override
	public boolean updateByEmail(FashionFactoryDTO dto) {
		System.out.println("updateByEmail method in repository");
		EntityManager manager = factory.createEntityManager();
	Query query	=manager.createNamedQuery("updateByEmail");
	query.setParameter("nm",dto.getCustomerName());
	query.setParameter("add",dto.getAddress());
	manager.getTransaction().begin();
	    int row  =query.executeUpdate();
	    manager.getTransaction().commit();
		FashionFactoryEntity entity = new FashionFactoryEntity();
		
		return row>0;
	}
}
