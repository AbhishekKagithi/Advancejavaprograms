package FirstApplicationpackage;

import jakarta.servlet.ServletException;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Firstprogramservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	PrintWriter writer = response.getWriter();
	writer.println("<html>");
	
	writer.println("<h1>Welcome to Sathya Tech</h1>");
	writer.println("Advance java first program");
	writer.println("Servlets first program");
	writer.println("Ratan sir classes");
	writer.println("</html>");
	}

}
