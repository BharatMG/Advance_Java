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

@WebServlet(urlPatterns = "/read")
public class ReadServlet extends HttpServlet {
	CollegeDto dto = new CollegeDto();
	CollegeService ser = new CollegeServiceImpl();

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		List<CollegeDto> read = ser.readAll();
		req.setAttribute("d", read);
		System.out.println(read);

		RequestDispatcher dispatcher = req.getRequestDispatcher("read.jsp");
		dispatcher.forward(req, resp);
	}
}