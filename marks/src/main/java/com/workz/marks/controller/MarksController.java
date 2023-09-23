package com.workz.marks.controller;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@RequestMapping("/")
public class MarksController {

	public MarksController() {
		System.out.println("MarksController constructor");
	}

	@PostMapping("/save")
	public String onSave(@RequestParam String candidateName, @RequestParam int kannada, @RequestParam int english,
			@RequestParam int hindi, @RequestParam int science, @RequestParam int mathematics,
			@RequestParam int socialScience, Model model) {
		model.addAttribute("name", candidateName);
		model.addAttribute("kannada", kannada);
		model.addAttribute("english", english);
		model.addAttribute("hindi", hindi);
		model.addAttribute("science", science);
		model.addAttribute("mathematics", mathematics);
		model.addAttribute("socialScience", socialScience);

		int total = (kannada + english + hindi + science + mathematics + socialScience);
		double percentage=((total*100)/600);
		System.out.print(percentage);
			
		System.out.println("save...");
		model.addAttribute("total", total);
		model.addAttribute("percent",percentage);
		
		int[] marks={kannada,english,hindi,science,mathematics,socialScience};
		int large=marks[0];
		for (int i=0;i<marks.length;i++) {
			if (marks[i]>large) {
				large=marks[i];
			}
		}
		System.out.println("large number:"+large);
		int lowest=marks[0];
		for (int i=0;i<marks.length;i++) {	
			if (marks[i]<lowest) {
				lowest=marks[i];
			}
		}
		System.out.println("lowest number:"+lowest);
		model.addAttribute("large", large);
		model.addAttribute("lowest",lowest);
		System.out.println(total);
		return "index.jsp";
	}
	
}
