package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/ThirdServlet")
public class ThirdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

   
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//get the user data
		String email = request.getParameter("email");
		int mobile = Integer.parseInt(request.getParameter("mobile"));
		
		//create session object
		
		HttpSession session = request.getSession(false);
		
		//give the output
		
		PrintWriter writer = response.getWriter();
		response.setContentType("text/html");
		writer.println("<html>");
		writer.println("<pre>");
		writer.println("User name is  "+session.getAttribute("username"));
		writer.println("Age is  "+session.getAttribute("age"));
		writer.println("user id is   "+session.getAttribute("id"));
		writer.println("Qualification is   "+session.getAttribute("Qualification"));
		writer.println("Department is   "+session.getAttribute("Department"));
		writer.println("Email is   "+email);
		writer.println("mobile is   "+mobile);
		writer.println("</pre>");
		writer.println("</html>");
	}
}
		