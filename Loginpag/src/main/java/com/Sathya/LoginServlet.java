package com.Sathya;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    
   
	protected void doGet(jakarta.servlet.http.HttpServletRequest request, jakarta.servlet.http.HttpServletResponse response) throws ServletException, IOException {
		String st;
		//step1 : get the data
		String Username = request.getParameter("username");
		String password = request.getParameter("password");
		//step 2 : process the data
		if(Username.equals("Sathya")&&password.equals("Sathya@123"))
			st = "Login Success";
		
		else
			st = "Login failed";
		//step 3 : Render the response
		PrintWriter writer = response.getWriter();
		response.setContentType("text/html");
		writer.println("<html>");
		writer.println("<h1>Login Status</h1>");
		writer.println(st);
		writer.println("</html>");
		
	}

}
