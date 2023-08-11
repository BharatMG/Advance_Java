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
		} else {
			return false;
		}
	}

	@Override
	public boolean searchBySoftwateName(String softwateName) {
		if (softwateName != null) {
			boolean search = repository.searchBySoftwateName(softwateName);

		}
		return false;
	}

	@Override
	public boolean deleteBySoftwareName(String softwateName) {
		if (softwateName != null) {
			boolean delete = repository.deleteBySoftwareName(softwateName);
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean updateById(int id, String userName, String email, long phoneNumber, String softwateName, int version,
			int doe, String password, double price, double osVersion) {
		if (id != 0 && userName != null && email != null && phoneNumber != 0 && softwateName != null && version != 0
				&& doe != 0 && password != null && price != 0 && osVersion != 0) {
			boolean u = repository.updateById(id, userName, email, phoneNumber, softwateName, version, doe, password,
					price, osVersion);
			return true;
		} else {
			return false;
		}
	}
}