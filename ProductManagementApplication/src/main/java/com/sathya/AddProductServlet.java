package com.sathya;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import org.apache.commons.io.IOUtils;

@WebServlet("/AddProductServlet")
@MultipartConfig
public class AddProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// Read the from data
		String proId=request.getParameter("proId");
		String proName=request.getParameter("proName");
		double proPrice=Double.parseDouble(request.getParameter("proPrice"));
		String proBrand=request.getParameter("proBrand");
		String proMadeIn=request.getParameter("proMadeIn");
		Date proMfgDate=Date.valueOf(request.getParameter("proMfgDate"));
		Date proExpDate=Date.valueOf(request.getParameter("proExpDate"));
		Part part=request.getPart("proImage");
		InputStream inputstream=part.getInputStream();
		
		byte [] proImage = IOUtils.toByteArray(inputstream);
		
		Part audiopart=request.getPart("proAudio");
		InputStream audiostream=part.getInputStream();
		
		byte [] proAudio = IOUtils.toByteArray(audiostream);
		
		Part videopart=request.getPart("proVideo");
		InputStream videostream=part.getInputStream();
		
		byte [] proVideo = IOUtils.toByteArray(videostream);
		
		// Using above details create Product object
		Product product=new Product();
		product.setProId(proId);
		product.setProName(proName);
		product.setProPrice(proPrice);
		product.setProBrand(proBrand);
		product.setProMadeIn(proMadeIn);
		product.setProMfgDate(proMfgDate);
		product.setProExpDate(proExpDate);
		product.setProImage(proImage);
		product.setProImage(proAudio);
		product.setProImage(proVideo);
		
		// Giving the product object to ProductDAO layer save method to save the data into database
		ProductDAO productDAO=new ProductDAO();
		int result = productDAO.saveProduct(product);
		
		
		
		
		if(result == 1)
		{
			//to send the data to jsp if the data is inserted 
			request.setAttribute("Result", result);
			RequestDispatcher dispatcher = request.getRequestDispatcher("productList.jsp");
			dispatcher.forward(request, response);
		}
		else
		{
			response.setContentType("text/html");
			PrintWriter writer=response.getWriter();
			
			writer.println("Data insertion failed "+ result);
			RequestDispatcher dispatcher = request.getRequestDispatcher("Productdetails.html");
			dispatcher.include(request, response);
		}
		
		/*writer.println("<html>");
		writer.println("<body bgcolor='lime'>");
		writer.println("<h2>Product saved Successfully into database...  </h2>");
		writer.println("<h5> Product Id: "+proId+"</h5>");
		writer.println("<h5> Product Name: "+proName+"</h5>");
		writer.println("<h5> Product Price: "+proPrice+"</h5>");
		writer.println("<h5> Product Brand: "+proBrand+"</h5>");
		writer.println("<h5> Product Made In: "+proMadeIn+"</h5>");
		writer.println("<h5> Product Mfg date: "+proMfgDate+"</h5>");
		writer.println("<h5> Product Exp Date: "+proExpDate+"</h5>");
		writer.println("<h5> Product Image: "+proImage+"</h5>");
		writer.println("</body>");
		writer.println("</html>");*/
		
		
	}

}