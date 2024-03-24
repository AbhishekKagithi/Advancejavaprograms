package com.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/SecondServlet")
public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

   
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//get the user data
		String Qualification = request.getParameter("Qualification");
		String Department = request.getParameter("Department");
		
		//create session object
		
		HttpSession session = request.getSession(false);
		
		//add the data to session
		
		session.setAttribute("Qualification", Qualification);
		session.setAttribute("Department", Department);
		
		
		//give the direction to next web page
		
	RequestDispatcher dispatcher = request.getRequestDispatcher("third.html");
	dispatcher.forward(request, response);
	
	}

}
