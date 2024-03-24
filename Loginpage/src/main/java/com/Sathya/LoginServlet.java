package com.Sathya;

import jakarta.servlet.ServletException;

import java.io.IOException;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String st;
		//step 1 : get the data
		String Username = request.getParameter("Username");
		request.getParameter("password");
		//step 2: process the data
		if(Username.equals("Sathya")&& password.equals("Sathya@123"))
			st = "Login Success";
		else
			st = "Login failure";
		//step 3: Render the response
		PrintWriter writer = response.getWriter();
		response.setContentType("text/html");
		writer.println("<html>");
		writer.println("<h1> Login Status</h1>");
		writer.println(st);
		writer.println("</html>");
	}

}
