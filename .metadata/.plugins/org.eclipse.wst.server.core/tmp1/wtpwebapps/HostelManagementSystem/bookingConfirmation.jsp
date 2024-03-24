<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Confirm Booking</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>
	<div class="container mt-5">
		<h2>Booking Confirmed</h2>
		<%System.out.println("Username: "+request.getParameter("username"));
		System.out.println("luxuryRooms: "+request.getAttribute("luxuryRooms"));
		System.out.println("deluxeRooms: "+request.getAttribute("deluxeRooms"));
		System.out.println("normalRooms: "+request.getAttribute("normalRooms"));%>
		<%session.setAttribute("luxuryRooms", request.getAttribute("luxuryRooms"));
		session.setAttribute("deluxeRooms", request.getAttribute("deluxeRooms"));
		session.setAttribute("normalRooms", request.getAttribute("normalRooms"));%>
		<a href="home.jsp?username=<%=request.getParameter("username")%>" class="btn btn-primary btn-block" >Return Home</a>
	</div>
</body>
</html>
