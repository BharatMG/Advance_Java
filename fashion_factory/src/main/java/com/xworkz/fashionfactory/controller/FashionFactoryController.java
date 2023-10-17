package com.xworkz.fashionfactory.controller;

import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.fashionfactory.dto.FashionFactoryDTO;
import com.xworkz.fashionfactory.service.FashionFactoryService;

import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("/")
@Slf4j
public class FashionFactoryController {

	@Autowired
	public FashionFactoryService service;

	@PostMapping("save")
	public String onSave(@ModelAttribute FashionFactoryDTO dto, Model model) {
		System.out.println("onSave method " + dto);
		model.addAttribute("dto", dto);
		Set<ConstraintViolation<FashionFactoryDTO>> save = service.onSave(dto);
		log.info("using loggers" + save.toString());

		if (save.isEmpty()) {
			model.addAttribute("msg", "no violations occurred");
			return "success";
		} else {
			model.addAttribute("validator", save);
			return "Register";
		}
	}

	@GetMapping("read")
	public String readAll(Model model) {
		List<FashionFactoryDTO> dtos = service.readall();
		System.out.println("Start");
		log.info(dtos.toString());
		System.out.println("End");
		model.addAttribute("dto", dtos);
		System.out.println(dtos);
		return "readall";

	}

	@GetMapping("readById")
	public String readById(@RequestParam int id, Model model) {
		System.out.println("readById method");
		FashionFactoryDTO dtos = service.findById(id);
		model.addAttribute("dto", dtos);
		return "readById";
	}

	@GetMapping("readByEmail")
	public String readByEmail(@RequestParam String emailId, Model model) {
		System.out.println("readByEmail method: " + emailId);
		List<FashionFactoryDTO> dto = service.findByEmail(emailId);
		model.addAttribute("dto", dto);
		return "readByEmail";
	}

	@GetMapping("delete")
	public String deleteById(@RequestParam int id, Model model) {
		System.out.println("deleteById method");
		boolean delete = service.deleteById(id);
		if (delete == true) {
			model.addAttribute("success", "record deleted successfully.......");
			return "readall";
		} else {
			model.addAttribute("unsuccess", "record not deleted ");

			return "readall";
		}
	}

	@GetMapping("update")
	public String updateById(@RequestParam int id, Model model) {
		System.out.println("updateById method in controller:" + id);
		FashionFactoryDTO dto = service.findById(id);
		if (dto == null) {
			model.addAttribute("message", "message not found");
			return "update";
		} else {
			model.addAttribute("dto", dto);
			return "update";
		}
	}

	@PostMapping("update")
	public String update(@ModelAttribute FashionFactoryDTO dto, Model model) {
		boolean update = service.updateById(dto);
		if (update == true) {
			model.addAttribute("updateMessage", "updated successfully..........");
			return "readall";
		} else {
			model.addAttribute("updateMessage", "...not updated ..........");
			return "update";
		}
	}

}
