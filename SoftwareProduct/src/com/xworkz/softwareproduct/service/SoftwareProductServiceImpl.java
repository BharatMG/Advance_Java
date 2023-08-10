package com.xworkz.softwareproduct.service;

import com.xworkz.softwareproduct.dto.SoftwareProductDTO;
import com.xworkz.softwareproduct.repository.SoftwareProductRepository;
import com.xworkz.softwareproduct.repository.SoftwareProductRepositoryImpl;

public class SoftwareProductServiceImpl implements SoftwareProductService {

	SoftwareProductRepository repository = new SoftwareProductRepositoryImpl();

	public SoftwareProductServiceImpl() {
		System.out.println("SoftwareProductServiceImpl constructor");
	}

	@Override
	public boolean validateAndSave(SoftwareProductDTO dto) {
		if (dto != null) {
			boolean save = repository.onSave(dto);
			return true;
		} else {
			return false;
		}
	}

	@Override
	public void readAllData() {
		System.out.println("reading All data");
		repository.readAll();

	}

	@Override
	public boolean updatePriceBySoftwareVersion(double price, int version) {
		if (price != 0 && version != 0) {
			boolean update = repository.updatePriceBySoftwareVersion(price, version);
		}
		return false;
	}

	@Override
	public boolean searchById(int id) {
		if (id != 0) {
			boolean search = repository.searchById(id);

		}
		return false;
	}

	@Override
	public boolean searchByversion(int version) {
		if (version != 0) {
			boolean search = repository.searchByversion(version);
return true;
		}else {
		return false;
	}
}

	@Override
	public boolean searchBySoftwateName(String softwateName) {
		if (softwateName!=null) {
			boolean search=repository.searchBySoftwateName(softwateName);
			
		}
		return false;
	}

	@Override
	public boolean deleteBySoftwareName(String softwateName) {
		if (softwateName!=null) {
			boolean delete=repository.deleteBySoftwareName(softwateName);
			return true;
		}else {
		return false;
	}
}

	@Override
	public boolean updateById(int id,SoftwareProductDTO dto) {
		if (id!=0  && dto!=null) {
		boolean update=repository.updateById(id,dto);	
		}
		return false;
	}
}