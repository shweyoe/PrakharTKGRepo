package com.yash.controler;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yash.domain.Customer;

/**
 * Servlet implementation class frontControllerServlet
 */
@WebServlet("/frontControllerServlet")
public class FrontControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
		HttpServletResponse response) throws ServletException, IOException {
		Customer customer = new Customer();
		customer.setAge(Integer.parseInt(request.getParameter("age")));
		customer.setName(request.getParameter("name"));
		customer.setCity(request.getParameter("city"));
		HelperControler.doProcess(request, response, customer);
	}

}