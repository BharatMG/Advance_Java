package com.xworkz.fashionfactory.service;

import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;

import com.xworkz.fashionfactory.dto.FashionFactoryDTO;



public interface FashionFactoryService {

	public Set<ConstraintViolation<FashionFactoryDTO>> onSave(FashionFactoryDTO dto);

	public List<FashionFactoryDTO> readall();

	public FashionFactoryDTO findById(int id);

	public List<FashionFactoryDTO> findByEmail(String email);

	public boolean deleteById(int id);

	public boolean updateById(FashionFactoryDTO dto);

}
