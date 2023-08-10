package com.xworkz.softwareproduct.controller;

import com.xworkz.softwareproduct.dto.SoftwareProductDTO;
import com.xworkz.softwareproduct.service.SoftwareProductService;
import com.xworkz.softwareproduct.service.SoftwareProductServiceImpl;

public class SoftwareProductRunner {

	public static void main(String[] args) {
		SoftwareProductDTO dto = new SoftwareProductDTO();

		dto.setId(2);
		dto.setUserName("partha");
		dto.setEmail("partha@gmail.com");
		dto.setPhoneNumber(9998766463L);
		dto.setSoftwateName("Avg");
		dto.setVersion(10);
		dto.setDoe(2026);
		dto.setPassword("63ug7w");
		dto.setPrice(1200);
		dto.setOsVersion(15);

		SoftwareProductService service = new SoftwareProductServiceImpl();
		service.validateAndSave(dto);
		 service.readAllData();
		 service.updatePriceBySoftwareVersion(2000, 10);
		 service.searchById(2);
		 service.searchByversion(11);
		 service.searchBySoftwateName("McAfee");
		 service.deleteBySoftwareName("Antivirus");
		SoftwareProductDTO dto1 = new SoftwareProductDTO();

		dto1.setUserName("ganesh");
		dto1.setEmail("ganesh@gmail.com");
		dto1.setPhoneNumber(7878766463L);
		dto1.setSoftwateName("Antivirus");
		dto1.setVersion(10);
		dto1.setDoe(2022);
		dto1.setPassword("63ug7w");
		dto1.setPrice(889);
		dto1.setOsVersion(10);
		service.updateById(1, dto1);
	}
}
