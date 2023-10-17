package com.xworkz.fashionfactory.repository;

import java.util.List;

import com.xworkz.fashionfactory.dto.FashionFactoryDTO;
import com.xworkz.fashionfactory.entity.FashionFactoryEntity;

public interface FashionFactoryRepository {

	public boolean onSave(FashionFactoryDTO dto);
	
	public List<FashionFactoryEntity> readAll();
	
	public FashionFactoryEntity findById(int id);

	public List<FashionFactoryEntity> findByEmail(String emailId);
	
	public boolean deleteById(int id);
	
	public boolean updateById(FashionFactoryDTO dto);
	
	public boolean updateByEmail(FashionFactoryDTO dto);
}
