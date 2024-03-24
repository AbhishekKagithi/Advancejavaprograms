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

@WebServlet("/FirstCookieServlet")
public class FirstCookieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

   
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//get the user data
		String username = request.getParameter("username");
		String age = request.getParameter("age");
		String id = request.getParameter("id");
		
		//create cookie object
		
		Cookie cookie1 = new Cookie("username",username);
		Cookie cookie2 = new Cookie("age",age);
		Cookie cookie3 = new Cookie("id",id);
		
		//send the cookie to  the client page
		response.addCookie(cookie1);
		response.addCookie(cookie2);
		response.addCookie(cookie3);
		
		//give the direction to next webpage
		
	RequestDispatcher dispatcher = request.getRequestDispatcher("second.html");
	dispatcher.forward(request, response);
	
	}

}
