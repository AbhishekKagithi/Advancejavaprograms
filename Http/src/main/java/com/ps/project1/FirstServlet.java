package com.ps.project1;

import java.io.IOException;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;


@WebServlet("/fs")
public class FirstServlet extends GenericServlet {

    @Override
   
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		   String xid = req.getParameter("id");
	        int Sid = Integer.parseInt(xid);
	        String Sname = req.getParameter("nm");
	        String Sdept = req.getParameter("dp");
	        String perc = req.getParameter("pc");
	        Float Sperc = Float.parseFloat(perc);

	        PrintWriter out = resp.getWriter();

	        out.println("<html>" +
	                    "<head><title>Registration Success</title></head>" +
	                    "<body style='background-color: #ffd800; text-align: center;'>" +
	                    "<h2 style='color: #336699;'>Student Registration Successful</h2>" +
	                    "<p>The details of " + Sname + " have been collected.</p>" +
	                    "<p>Student ID: " + Sid + "</p>" +
	                    "<p>Department: " + Sdept + "</p>" +
	                    "<p>Percentage: " + Sperc + "</p>" +
	                    "<a href='Home.html'>Go back to Home</a>" +
	                    "</body>" +
	                    "</html>");

	        out.flush();
	        out.close();


	        int count = 0;
	        try (Connection con = DriverManager.getConnection("jdbc:mysql://Localhost:3306/bharath?user=root&password=tiger");
	             PreparedStatement pstate = con.prepareStatement("INSERT INTO bharath.student VALUES (?, ?, ?, ?)")) {

	            pstate.setInt(1, Sid);
	            pstate.setString(2, Sname);
	            pstate.setString(3, Sdept);
	            pstate.setDouble(4, Sperc);
	            count = pstate.executeUpdate();
	            System.out.println(count);

	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }
		
	
}
