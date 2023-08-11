package com.xworkz.softwareproduct.repository;

import com.xworkz.softwareproduct.dto.SoftwareProductDTO;

public interface SoftwareProductRepository {

	boolean onSave(SoftwareProductDTO dto);

	void readAll();

	boolean updatePriceBySoftwareVersion(double price, int version);

	boolean searchById(int id);

	boolean searchByversion(int version);

	boolean searchBySoftwateName(String softwateName);

	boolean deleteBySoftwareName(String softwateName);

	public boolean updateById(int id, String userName, String email, long phoneNumber, String softwateName, int version,
			int doe, String password, double price, double osVersion);

}
