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

	boolean updateById(int id,SoftwareProductDTO dto);

}
