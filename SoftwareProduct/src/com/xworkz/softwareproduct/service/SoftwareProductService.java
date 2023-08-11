package com.xworkz.softwareproduct.service;

import com.xworkz.softwareproduct.dto.SoftwareProductDTO;

public interface SoftwareProductService {

	public boolean validateAndSave(SoftwareProductDTO dto);

	public boolean updatePriceBySoftwareVersion(double price, int version);

	void readAllData();

	public boolean searchById(int id);

	public boolean searchByversion(int version);

	public boolean searchBySoftwateName(String softwateName);

	public boolean deleteBySoftwareName(String softwateName);

	public boolean updateById(int id, String userName, String email, long phoneNumber, String softwateName, int version,
			int doe, String password, double price, double osVersion);

}
