package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ThirdCookieServlet")
public class ThirdCookieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

   
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//get the user data
		String email = request.getParameter("email");
		String mobile = request.getParameter("mobile");
		
		//create session object
		
		Cookie cookie7 = new Cookie("email",email);
		Cookie cookie6 = new Cookie("mobile",mobile);
		
		//add the data to session
		
				response.addCookie(cookie7);
				response.addCookie(cookie6);
		
				Cookie[] cookies = request.getCookies();
		//give the output
		
		PrintWriter writer = response.getWriter();
		response.setContentType("text/html");
		writer.println("<html>");
		
		writer.println("<pre>");
		writer.println("User name is  "+cookies[0].getValue());
		/*writer.println("Age is  "+cookies[1].getValue());
		writer.println("user id is   "+cookies[2].getValue());
		writer.println("Qualification is   "+cookies[3].getValue());
		writer.println("Department is   "+cookies[4].getValue());
		writer.println("Email is   "+cookies[5].getValue());
		writer.println("mobile is   "+cookies[6].getValue());
		writer.println("mobile is   "+cookies[6].getValue());*/
		writer.println("</pre>");
		
		writer.println("</html>");
	}
}
		