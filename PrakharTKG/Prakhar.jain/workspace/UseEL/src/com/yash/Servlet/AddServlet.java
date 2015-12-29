package com.yash.Servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yash.Domain.Address;
import com.yash.Domain.Employee;

/**
 * Servlet implementation class AddServlet
 */
@WebServlet("/AddServlet")
public class AddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Employee employee=new Employee();
		Address address=new Address();
		employee.setEmpId(1);
		employee.setName("Prakhar Jain");
		address.setHouseNo(10);
		address.setStreet(" 4 B sainath colony");
		address.setCity(" indore");
		address.setState(" Madhya Pradesh");
		employee.setAddress(address);
		request.setAttribute("employee",employee);
		request.getRequestDispatcher("show.jsp").forward(request, response);
	}

}