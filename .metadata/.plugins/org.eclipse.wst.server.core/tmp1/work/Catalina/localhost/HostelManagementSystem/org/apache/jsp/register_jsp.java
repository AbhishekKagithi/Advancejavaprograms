/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.86
 * Generated at: 2024-03-16 16:04:06 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("/WEB-INF/lib/taglibs-standard-impl-1.2.5.jar", Long.valueOf(1709629692186L));
    _jspx_dependants.put("jar:file:/C:/Users/ABHISHEK/eclipse-workspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp1/wtpwebapps/HostelManagementSystem/WEB-INF/lib/taglibs-standard-impl-1.2.5.jar!/META-INF/c.tld", Long.valueOf(1425958870000L));
    _jspx_dependants.put("/component/navbar.jsp", Long.valueOf(1710478537148L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(3);
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<title>User Registration</title>\r\n");
      out.write("\r\n");
      out.write("<link\r\n");
      out.write("	href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css\"\r\n");
      out.write("	rel=\"stylesheet\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"style.css\">\r\n");
      out.write("<script src=\"register_validations.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("	<!-- Navigation Bar -->\r\n");
      out.write("	");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<nav class=\"navbar navbar-expand-lg navbar-dark bg-info\">\r\n");
      out.write("	<div class=\"container-fluid\">\r\n");
      out.write("		<a class=\"navbar-brand\" href=\"welcome_page.jsp\"><i\r\n");
      out.write("			class=\"fa-solid fa-house-medical\"></i>HOSTEL WORLD</a>\r\n");
      out.write("		<button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\"\r\n");
      out.write("			data-bs-target=\"#navbarSupportedContent\"\r\n");
      out.write("			aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\"\r\n");
      out.write("			aria-label=\"Toggle navigation\">\r\n");
      out.write("			<span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("		</button>\r\n");
      out.write("		<div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\r\n");
      out.write("			<ul class=\"navbar-nav ms-auto mb-2 mb-lg-0\">\r\n");
      out.write("\r\n");
      out.write("				<li class=\"nav-item\"><a class=\"nav-link active\"\r\n");
      out.write("					aria-current=\"page\" href=\"welcome_page.jsp\">Home</a></li>\r\n");
      out.write("\r\n");
      out.write("				<li class=\"nav-item\"><a class=\"nav-link active\"\r\n");
      out.write("					aria-current=\"page\" href=\"login.jsp\">Login</a></li>\r\n");
      out.write("\r\n");
      out.write("				<li class=\"nav-item\"><a class=\"nav-link active\"\r\n");
      out.write("					aria-current=\"page\" href=\"register.jsp\">Register</a></li>\r\n");
      out.write("\r\n");
      out.write("				<li class=\"nav-item\"><a class=\"nav-link active\"\r\n");
      out.write("					aria-current=\"page\" href=\"Images.jsp\">Gallery</a></li>\r\n");
      out.write("				<li class=\"nav-item\"><a class=\"nav-link active\"\r\n");
      out.write("					aria-current=\"page\" href=\"#\">About Us</a></li>\r\n");
      out.write("			</ul>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("</nav>");
      out.write("\r\n");
      out.write("\r\n");
      out.write("	<!-- Registration Form -->\r\n");
      out.write("	<div class=\"container\">\r\n");
      out.write("		<h2>User Registration</h2>\r\n");
      out.write("		<form method=\"post\" action=\"./RegisterServlet\"\r\n");
      out.write("			onsubmit=\"return registerValidations() \">\r\n");
      out.write("\r\n");
      out.write("			<div class=\"form-group\">\r\n");
      out.write("				<label for=\"name\" class=\"form-label\">Name:</label> <input\r\n");
      out.write("					type=\"text\" name=\"name\" id=\"name\" class=\"form-control\"\r\n");
      out.write("					placeholder=\"Enter name\" required>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"form-group\">\r\n");
      out.write("				<label for=\"password\" class=\"form-label\">Password:</label> <input\r\n");
      out.write("					type=\"password\" name=\"password\" id=\"password\" class=\"form-control\"\r\n");
      out.write("					placeholder=\"Enter password\" required>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"form-group\">\r\n");
      out.write("				<label for=\"confirmpassword\" class=\"form-label\">Confirm\r\n");
      out.write("					Password:</label> <input type=\"password\" name=\"confirmpassword\"\r\n");
      out.write("					id=\"confirmpassword\" class=\"form-control\"\r\n");
      out.write("					placeholder=\"Confirm password\" required>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"form-group\">\r\n");
      out.write("				<label for=\"email\" class=\"form-label\">Email:</label> <input\r\n");
      out.write("					type=\"email\" name=\"email\" id=\"email\" class=\"form-control\"\r\n");
      out.write("					placeholder=\"Enter email\" required>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"form-group\">\r\n");
      out.write("				<label for=\"mobile\" class=\"form-label\">Mobile:</label> <input\r\n");
      out.write("					type=\"number\" name=\"mobile\" id=\"mobile\" class=\"form-control\"\r\n");
      out.write("					placeholder=\"Enter mobile\" required>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"form-group\">\r\n");
      out.write("				<label for=\"address\" class=\"form-label\">Address:</label>\r\n");
      out.write("				<textarea name=\"address\" id=\"address\" class=\"form-control\"\r\n");
      out.write("					placeholder=\"Enter Complete address\" rows=\"4\" cols=\"50\" required></textarea>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"form-group\">\r\n");
      out.write("				<button type=\"submit\" class=\"btn btn-primary\">Register</button>\r\n");
      out.write("			</div>\r\n");
      out.write("\r\n");
      out.write("			<div class=\"already-registered\">\r\n");
      out.write("				<p>\r\n");
      out.write("					Already Registered? <a href=\"login.html\">Login Here</a>\r\n");
      out.write("				</p>\r\n");
      out.write("			</div>\r\n");
      out.write("		</form>\r\n");
      out.write("	</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
