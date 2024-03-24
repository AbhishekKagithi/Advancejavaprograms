package com.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/SecondCookieServlet")
public class SecondCookieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

   
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//get the user data
		String Qualification = request.getParameter("Qualification");
		String Department = request.getParameter("Department");
		
		//create session object
		
		Cookie cookie5 = new Cookie("Qualification",Qualification);
		Cookie cookie4 = new Cookie("Department",Department);
		
		//add the data to session
		
		response.addCookie(cookie5);
		response.addCookie(cookie4);
		
		//give the direction to next web page
		
	RequestDispatcher dispatcher = request.getRequestDispatcher("third.html");
	dispatcher.forward(request, response);
	
	}

}
