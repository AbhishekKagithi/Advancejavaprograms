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


@WebServlet("/UpdateProductServlet")
@MultipartConfig
public class UpdateProductServlet extends HttpServlet {
	
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String proId=request.getParameter("proId");
		String proName=request.getParameter("proName");
		double proPrice=Double.parseDouble(request.getParameter("proPrice"));
		String proBrand=request.getParameter("proBrand");
		String proMadeIn=request.getParameter("proMadeIn");
		Date proMfgDate=Date.valueOf(request.getParameter("proMfgDate"));
		Date proExpDate=Date.valueOf(request.getParameter("proExpDate"));
		
		// Using above details create Product object
				Product product=new Product();
				product.setProId(proId);
				product.setProName(proName);
				product.setProPrice(proPrice);
				product.setProBrand(proBrand);
				product.setProMadeIn(proMadeIn);
				product.setProMfgDate(proMfgDate);
				product.setProExpDate(proExpDate);
				
				Part part=request.getPart("newProImage");
				if(part!=null && part.getSize()>0)
				{
				InputStream inputstream=part.getInputStream();
				
				byte [] proImage = IOUtils.toByteArray(inputstream);
				
				product.setProImage(proImage);
				}
				else
				{
					Part part2=request.getPart("existingImage");
					InputStream inputstream=part2.getInputStream();
					
					byte [] existingImage = IOUtils.toByteArray(inputstream);
					
					product.setProImage(existingImage);
				}
				
				Part audiopart=request.getPart("newProImage");
				if(part!=null && audiopart.getSize()>0)
				{
				InputStream inputstream=audiopart.getInputStream();
				
				byte [] proAudio = IOUtils.toByteArray(inputstream);
				
				product.setProImage(proAudio);
				}
				else
				{
					Part audiopart2=request.getPart("existingAudio");
					InputStream inputstream=audiopart2.getInputStream();
					
					byte [] existingAudio = IOUtils.toByteArray(inputstream);
					
					product.setProImage(existingAudio);
				}
				
				Part videopart=request.getPart("newProVideo");
				if(part!=null && videopart.getSize()>0)
				{
				InputStream inputstream=videopart.getInputStream();
				
				byte [] proVideo = IOUtils.toByteArray(inputstream);
				
				product.setProImage(proVideo);
				}
				else
				{
					Part videopart2=request.getPart("existingVideo");
					InputStream inputstream=videopart2.getInputStream();
					
					byte [] existingVideo = IOUtils.toByteArray(inputstream);
					
					product.setProImage(existingVideo);
				}
				
				// Giving the product object to ProductDAO layer save method to save the data into database
				ProductDAO productDAO=new ProductDAO();
				int result = productDAO.update(product);
				
				
				
				
				if(result == 1)
				{
					//to send the data to jsp if the data is inserted 
					request.setAttribute("Result1", result);
					RequestDispatcher dispatcher = request.getRequestDispatcher("productList.jsp");
					dispatcher.forward(request, response);
				}
				else
				{
					response.setContentType("text/html");
					PrintWriter writer=response.getWriter();
					
					writer.println("Data updation failed "+ result);
					RequestDispatcher dispatcher = request.getRequestDispatcher("Editform.jsp");
					dispatcher.include(request, response);
				}
	}

}
