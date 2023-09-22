package com.xworkz.college;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.college.dto.CollegeDto;
import com.xworkz.college.service.CollegeService;
import com.xworkz.college.service.CollegeServiceImpl;

@WebServlet(urlPatterns = "/click")
public class CollegeServlet extends HttpServlet {

	public CollegeServlet() {
		System.out.println("CollegeServlet constructor");
	}

	CollegeDto dto = new CollegeDto();
	CollegeService ser = new CollegeServiceImpl();

	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("name");
		String location = req.getParameter("location");
		String noOfStudents = req.getParameter("noOfStudents");
		String noOfStaffs = req.getParameter("noOfStaffs");

		dto.setName(name);
		dto.setLocation(location);
		dto.setNoOfStudents(noOfStudents);
		dto.setNoOfStaffs(noOfStaffs);
		System.out.println(dto);

		ser.save(dto);

//		List<CollegeDto>  read=ser.readAll();
//		System.out.println(read);
//		req.setAttribute("d", dto);

//	System.out.println(save);
//	if (save) {
//		System.out.println("data saved successfully");
//	}else {
//		System.out.println("invalid data");
//	}

//		ser.readAll();
		/*
		 * RequestDispatcher dispatcher = req.getRequestDispatcher("index.jsp");
		 * dispatcher.forward(req, resp);
		 */
//		ser.save(dto);

	}
}
