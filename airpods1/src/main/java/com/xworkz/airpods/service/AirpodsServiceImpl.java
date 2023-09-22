package com.xworkz.airpods.service;

import com.xworkz.airpods.dto.AirpodsDto;
import com.xworkz.airpods.repo.AirpodRepoImpl;
import com.xworkz.airpods.repo.AirpodsRepo;

public class AirpodsServiceImpl implements AirpodsService {

	AirpodsRepo repo = new AirpodRepoImpl();

	public boolean store(AirpodsDto dto) {
		return repo.store(dto);

	}

	public boolean updateColorByName(String color, String name) {
		
		if(color!=null && name!=null) {
			System.out.println("data for updation is valid");
			return repo.updateColorByName(color,name);
		}
		return false;
	}

	public boolean deleteByPrice(int price) {
		if(price>2000 && price<10000) {
			System.out.println("price valid");
			return repo.deleteByPrice(price);
		}
		return false;
	}

	public AirpodsDto readAll() {
		
		return repo.readAll();
	}

}
