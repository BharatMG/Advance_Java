package com.xworkz.softwareproduct.controller;

import com.xworkz.softwareproduct.dto.SoftwareProductDTO;
import com.xworkz.softwareproduct.service.SoftwareProductService;
import com.xworkz.softwareproduct.service.SoftwareProductServiceImpl;

public class SoftwareProductRunner {

	public static void main(String[] args) {
		SoftwareProductDTO dto = new SoftwareProductDTO();

		dto.setId(4);
		dto.setUserName("shakti");
		dto.setEmail("shakti@gmail.com");
		dto.setPhoneNumber(9998766463L);
		dto.setSoftwateName("Avg");
		dto.setVersion(12);
		dto.setDoe(2026);
		dto.setPassword("11ug7w");
		dto.setPrice(888);
		dto.setOsVersion(15);

		SoftwareProductService service = new SoftwareProductServiceImpl();

		int option = 2;
		switch (option) {
		case 1:
			service.validateAndSave(dto);
			break;
		case 2:
			service.readAllData();
			break;
		case 3:
			service.updatePriceBySoftwareVersion(2999, 12);
			break;
		case 4:
			service.searchById(2);
			break;
		case 5:
			service.searchByversion(11);
			break;
		case 6:
			service.searchBySoftwateName("McAfee");
		case 7:
			service.searchBySoftwateName("McAfee");
		case 8:
			service.updateById(1, "bhavana", "bhavana@gmail.com", 7689765432L, "Kaspersky", 7, 2020, "jd*@j", 525,
					10.1);
			break;
		default:
			System.out.println("please provide the correct option..");
			break;
		}
	}
}
