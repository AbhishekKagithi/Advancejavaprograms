package com.Sathya;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

   
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String Username = request.getParameter("Username");
		String Password = request.getParameter("Password");
		String Gender = request.getParameter("Gender");
		String DOB = request.getParameter("DOB");
		long Mobilenumber = Long.parseLong(request.getParameter("Mobilenumber"));
		String Email = request.getParameter("Email");
		String Comments = request.getParameter("Comments");
		
		String Qualification[] = request.getParameterValues("Qualification");
		String Country = request.getParameter("Country");
		String languages[] = request.getParameterValues("Languages");
		
//step 2:
String qual = String.join(",",Qualification);
String lang = String.join(",", languages);
		
		//step 3:
		response.setContentType("text/html");
		
		PrintWriter writer = response.getWriter();
		
		writer.println("<html>");
		
		writer.println("<body bgcolor = 'darkviolet'>");
		writer.println("<h1>Registration Details</h1>");
		writer.println("Username is: <br>"+Username+"<br><br>");
		writer.println("Password is: <br>"+Password+"<br><br>");
		writer.println("gender is: <br>"+Gender+"<br><br>");
		writer.println("Date of Birth is: <br>"+DOB+"<br><br>");
		writer.println("Mobile number is: <br>"+Mobilenumber+"<br><br>");
		writer.println("E mail is: <br>"+Email+"<br><br>");
		writer.println("Qualifications are: <br>"+qual+"<br><br>");
		writer.println("Languages known are: <br>"+lang+"<br><br>");
		writer.println("Country is : <br>"+Country+"<br><br>");
		writer.println("Comments are: <br>"+Comments+"<br><br>");
		
		writer.println("</body>");
		writer.println("</html>");
	}



	
	}



	


