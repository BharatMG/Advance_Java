package com.xworkz.airpods;

import com.xworkz.airpods.dto.AirpodsDto;
import com.xworkz.airpods.service.AirpodsService;
import com.xworkz.airpods.service.AirpodsServiceImpl;

public class AirpodsTester {

	public static void main(String[] args) {

		AirpodsService service = new AirpodsServiceImpl();

		AirpodsDto dto = new AirpodsDto("zebronics", 800, "brown", 12);

		int key=1;
		switch (key) {
		case 1:
			boolean save = service.store(dto);
			System.out.println(save);
			if (save) {
				System.out.println("data inserted successfully");
			} else {
				System.out.println("invalid data");
			}
			break;
		case 2:
			service.readAll();
			break;
		case 3:
			boolean update = service.updateColorByName("brown", "bolt");
			System.out.println(update);
			if (update) {
				System.out.println("color is updated");
			} else {
				System.out.println("Not updated");
			}
		case 4:
			boolean delete = service.deleteByPrice(2200);
			System.out.println(delete);
			if (delete) {
				System.out.println("data deleted successfully");
			} else {
				System.out.println("not deleted");
			}
			break;
		default:
			break;
		}
	}
}
