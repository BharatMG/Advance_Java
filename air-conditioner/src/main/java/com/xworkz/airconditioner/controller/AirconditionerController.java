package com.xworkz.airconditioner.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.airconditioner.dto.AirConditionerDTO;

@Component
@RequestMapping("/")
public class AirconditionerController {

	public AirconditionerController() {
		System.out.println("AirconditionerController constructor");
	}

	List<String> list = new ArrayList<String>();

//	@GetMapping("/getName")
//	public String getNames(Model model) {
//		list.add("Bharat");
//		list.add("200");
//		list.add("LG");
//		list.add("Brown");
//		model.addAttribute("name", list);
//		model.addAttribute("price", price);
//		model.addAttribute("brand", brand);
//		model.addAttribute("color", color);
//		return "index.jsp";
//	}
//	
	@GetMapping("/getDTO")
	public String getNetworkDto(Model model) {
		System.out.println("---getAirConditonerDto--");
		List<AirConditionerDTO> list = new ArrayList<AirConditionerDTO>();
		list.add(new AirConditionerDTO("bharat","LG",999,"Brown"));

		model.addAttribute("airDto", list);
		return "index.jsp";
}
}
