package com.xworkz.fashionfactory.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.fashionfactory.dto.FashionFactoryDTO;
import com.xworkz.fashionfactory.entity.FashionFactoryEntity;
import com.xworkz.fashionfactory.repository.FashionFactoryRepository;



@Service
public class FashionFactoryServiceImplementation implements FashionFactoryService {

	public FashionFactoryServiceImplementation() {
		System.out.println("FashionFactoryServiceImplementation constructor");
	}

	@Autowired
	public FashionFactoryRepository repository;

	@Override
	public Set<ConstraintViolation<FashionFactoryDTO>> onSave(FashionFactoryDTO dto) {
		System.out.println("onSave method in service");
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<FashionFactoryDTO>> violations = validator.validate(dto);
		if (violations.isEmpty()) {
			repository.onSave(dto);
			System.out.println("data saved successfully");
		} else {
			System.out.println("violations are present" + violations);
			return violations;
		}
		return violations;
	}

	@Override
	public List<FashionFactoryDTO> readall() {
		System.out.println("readall method in service");
		List<FashionFactoryEntity> entities = repository.readAll();
		List<FashionFactoryDTO> dtos = new ArrayList<FashionFactoryDTO>();
		for (FashionFactoryEntity fashionFactoryEntity : entities) {
			FashionFactoryDTO dto = new FashionFactoryDTO();
			BeanUtils.copyProperties(fashionFactoryEntity, dto);
			dtos.add(dto);
		}
		return dtos;
	}

	@Override
	public FashionFactoryDTO findById(int id) {
		System.out.println("findById method in service");
		FashionFactoryDTO dto = new FashionFactoryDTO();
		if (id != 0) {
			FashionFactoryEntity entity = repository.findById(id);
			if (entity != null) {
				System.out.println("entity is not null");
				BeanUtils.copyProperties(entity, dto);
			}
		} else {
			System.out.println("entity is null");
		}
		return dto;
	}

	@Override
	public List<FashionFactoryDTO> findByEmail(String email) {
		System.out.println("findByEmail method in service");
		List<FashionFactoryEntity> entities = repository.findByEmail(email);
		List<FashionFactoryDTO> dtos = new ArrayList<FashionFactoryDTO>();

		for (FashionFactoryEntity fashionFactoryEntity : entities) {
			FashionFactoryDTO dto = new FashionFactoryDTO();
			BeanUtils.copyProperties(fashionFactoryEntity, dto);
			dtos.add(dto);
		}
		return dtos;
	}

	@Override
	public boolean deleteById(int id) {
		System.out.println("deleteById in service");
		boolean delete = repository.deleteById(id);
		return delete;
	}

	@Override
	public boolean updateById(FashionFactoryDTO dto) {
		System.out.println("updateById in service method");
		boolean update = repository.updateById(dto);
		return update;
	}
}
