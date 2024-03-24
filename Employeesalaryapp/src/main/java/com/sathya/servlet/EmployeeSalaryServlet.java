package com.sathya.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/EmployeeSalaryServlet")
public class EmployeeSalaryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//step 1: 
		
				String EmployeeID = request.getParameter("EmployeeID");
				String EmployeeName = request.getParameter("EmployeeName");
				double EmployeeBasicSalary = Double.parseDouble(request.getParameter("EmployeeBasicSalary"));
				
				double pf,grosssalary,hra,da;
				
				//step 2: 
				
				
				
				if(EmployeeBasicSalary<=25000)
				{
					pf = 0.02*EmployeeBasicSalary;
					hra = 0.1*EmployeeBasicSalary;
					da = 0.03*EmployeeBasicSalary;
				}
				else
				{
					if(EmployeeBasicSalary<=50000&&EmployeeBasicSalary>25000)
					{
						pf = 0.03*EmployeeBasicSalary;
						hra = 0.2*EmployeeBasicSalary;
						da = 0.05*EmployeeBasicSalary;
					}
						else
						{
							pf = 0.06*EmployeeBasicSalary;
							hra = 0.3*EmployeeBasicSalary;
							da = 0.1*EmployeeBasicSalary;
						}
					

				}
				grosssalary = EmployeeBasicSalary + hra + da - pf;
				
				
				//step 3:
				response.setContentType("text/html");
				
				PrintWriter writer = response.getWriter();
				
				writer.println("<html>");
				
				writer.println("<body bgcolor = 'skyblue'>");
				writer.println("<h1>Employee salary details</h1>");
				writer.println("EmployeeID is: <br>"+EmployeeID+"<br><br>");
				writer.println("EmployeeName is: <br>"+EmployeeName+"<br><br>");
				writer.println("EmployeeBasicSalary is: <br>"+EmployeeBasicSalary+"<br><br>");
				writer.println("hra is: <br>"+hra+"<br><br>");
				writer.println("da is: <br>"+da+"<br><br>");
				writer.println("pf is: <br>"+pf+"<br><br>");
				writer.println("gross salary is <br>"+grosssalary);
				
				writer.println("</body>");
				writer.println("</html>");
			}

		

	}


