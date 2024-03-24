package com.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

   
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//get the user data
		String username = request.getParameter("username");
		int age = Integer.parseInt(request.getParameter("age"));
		String id = request.getParameter("id");
		
		//create session object
		
		HttpSession session = request.getSession();
		
		//add the data to session
		
		session.setAttribute("username", username);
		session.setAttribute("age", age);
		session.setAttribute("id", id);
		
		//give the direction to next webpage
		
	RequestDispatcher dispatcher = request.getRequestDispatcher("second.html");
	dispatcher.forward(request, response);
	
	}

}
