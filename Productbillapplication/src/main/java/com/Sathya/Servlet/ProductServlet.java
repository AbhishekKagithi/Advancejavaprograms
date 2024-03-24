package com.Sathya.Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ProductServlet")
public class ProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//step 1: 
		
		String ProductID = request.getParameter("ProductID");
		String ProductName = request.getParameter("ProductName");
		double ProductPrice = Double.parseDouble(request.getParameter("ProductPrice"));
		int ProductQuantity = Integer.parseInt(request.getParameter("ProductQuantity"));
		double netbill,totalbill,discount;
		
		//step 2: 
		
		totalbill = ProductQuantity*ProductPrice;
		
		if(totalbill<=1000)
			discount = 0;
		else
		{
			if(totalbill>1000&&totalbill<=5000)
				discount = 0.05*totalbill;
			else
			{
				if(totalbill>5000&&totalbill<=10000)
					discount = 0.10*totalbill;
				else
					discount = 0.15*totalbill;
			}

		}
		netbill = totalbill-discount;
		
		
		//step 3:
		response.setContentType("text/html");
		
		PrintWriter writer = response.getWriter();
		
		writer.println("<html>");
		
		writer.println("<body bgcolor = 'skyblue'>");
		writer.println("<h1>Product Billing Details</h1>");
		writer.println("Product ID is: <br>"+ProductID+"<br><br>");
		writer.println("Product Name is: <br>"+ProductName+"<br><br>");
		writer.println("Product Price is: <br>"+ProductPrice+"<br><br>");
		writer.println("Product Quantity is: <br>"+ProductQuantity+"<br><br>");
		writer.println("Product total bill is: <br>"+totalbill+"<br><br>");
		writer.println("Product discount is: <br>"+discount+"<br><br>");
		writer.println("Product bill to be paid is: <br>"+netbill);
		
		writer.println("</body>");
		writer.println("</html>");
	}

}
