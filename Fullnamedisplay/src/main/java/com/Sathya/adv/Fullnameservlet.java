package com.Sathya.adv;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.IOException;
@WebServlet("/Fullnameservlet")
public class Fullnameservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String Firstname = request.getParameter("Firstname");
		String Middlename = request.getParameter("Middlename");
		String Lastname = request.getParameter("Lastname");
		
		PrintWriter writer = response.getWriter();
		response.setContentType("text/html");
		writer.println("<html>");
		writer.println("<h1>Full name display</h1>" );


		writer.println("Full name is "+Firstname+" "+Middlename+" "+Lastname);
		writer.println("</html>");
	}

}
