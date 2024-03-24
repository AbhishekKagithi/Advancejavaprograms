package se.f1;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/as")
public class First extends GenericServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		Enumeration<String> keynum = req.getParameterNames();
		PrintWriter out=res.getWriter();		
		
while (keynum.hasMoreElements()) {
			String key=keynum.nextElement();
			String val=req.getParameter(key);
		    out.flush();
		    out.close();   
	}
	    
	}                   
}
