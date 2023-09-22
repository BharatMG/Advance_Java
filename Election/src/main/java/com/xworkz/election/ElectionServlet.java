package com.xworkz.election;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.election.dto.ElectionDto;
import com.xworkz.election.service.ElectionService;
import com.xworkz.election.service.ElectionServiceImpl;

@WebServlet(urlPatterns = "/save")
public class ElectionServlet extends HttpServlet {

	public ElectionServlet() {
		System.out.println("ElectionServlet servlet");
	}

	ElectionService service = new ElectionServiceImpl();
	ElectionDto dto = new ElectionDto();

	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String name = req.getParameter("name");
		long phoneNumber = Long.parseLong(req.getParameter("phoneNumber"));
		int age = Integer.parseInt(req.getParameter("age"));
		String address = req.getParameter("address");
		int pincode = Integer.parseInt(req.getParameter("pincode"));

		dto.setName(name);
		dto.setPhoneNumber(phoneNumber);
		dto.setAge(age);
		dto.setAddress(address);
		dto.setPincode(pincode);
		
		req.setAttribute("d1", dto);

		boolean status = service.save(dto);
		if (status) {
			System.out.println("data added successfully");
		} else {
//		response.setContentType("text/html");
//		PrintWriter writer = response.getWriter();
//		writer.print("Data not valid so not saved");
//		request.getRequestDispatcher("/ElectionForm.jsp").include(request, response);
			System.out.println("invalid data");
		}

		// RequestDispatcher dispatcher
		// =request.getRequestDispatcher("/Read.jsp").forward(request, response);
		RequestDispatcher dispatcher = req.getRequestDispatcher("index.jsp");
		dispatcher.forward(req, resp);
	}
}
