package com.sathya;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/EditProductServlet")
public class EditProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String proId = request.getParameter("proId");
		
		ProductDAO productDAO = new ProductDAO();
		
		Product existingProduct = productDAO.findById(proId);
		
		request.setAttribute("existingProduct", existingProduct);
		
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("Editform.jsp");
		requestDispatcher.forward(request, response);
	}

}
