package com.xworkz.orianmall.controller;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@RequestMapping("/")
public class OrianMallRunner {

	public OrianMallRunner() {
		System.out.println("OrianMallRunner constructor");
	}

	@PostMapping("/pricebill")
	public String onSave(Model model, @RequestParam String productName, @RequestParam String rating,
			@RequestParam double price, @RequestParam int quantity, @RequestParam String reviews) {
		double total =(price * quantity);
		model.addAttribute("name", productName);
		model.addAttribute("rating", rating);
		model.addAttribute("price", price);
		model.addAttribute("quantity", quantity);
		model.addAttribute("reviews", reviews);
		model.addAttribute("total",total);
		return "index.jsp";
	}
}