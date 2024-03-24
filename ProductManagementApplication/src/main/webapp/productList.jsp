<%@page import="com.sathya.ProductDAO" import = "java.util.Base64" %>

<%@ page language="java" contentType="text/html"%>
    <%@taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "a" %>
<!DOCTYPE html>
<html>
<head>

<title>Product List</title>
<!-- Bootstrap CDN(Content Delivery Network) link to get support of BootStrap -->
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css" />


</head>
<body>
	<div><h1 class = " container mt-5 text-center text-success">List of Available Products</h1>
	</div>
	<div>
	<a class = "btn btn-success" href = "Productdetails.html">Save Product</a> 
	</div>
	<div>
	<input type = search placeholder = search>
	</div>
	<div>
		<a:if test ="${Result == 1}">
		<h1 class = "text-center text-success"> Data is inserted</h1>
		</a:if>
		</div>
		<div>
		<a:if test ="${Result1 == 1}">
		<h1 class = "text-center text-success"> Data is updated</h1>
		</a:if>
		</div>
		
		<div>
		<a:if test ="${Count == 1}">
		<h1 class = "text-center text-danger"> Data is deleted</h1>
		</a:if>
		</div>
	
	<table class = "table table-bordered table-striped">
	
		<thead>
			<tr>
				<th>product ID</th>
				<th>product Name</th>
				<th>product Price</th>
				<th>product Brand</th>
				<th>product is Made in</th>
				<th>product Manufacture date </th>
				<th>product Expire date </th>
				<th>product image</th>
				<th> product audio</th>
				<th>product video</th>
				<th>action</th>
			</tr>
			</thead>
			<tbody>
				<a:forEach var = "pro" items = "<%= new ProductDAO().findAll()%>">
				<tr>
					<td>${pro.proId}</td>
					<td>${pro.proName}</td>
					<td>${pro.proPrice}</td>
					<td>${pro.proBrand}</td>
					<td>${pro.proMadeIn}</td>
					<td>${pro.proMfgDate}</td>
					<td>${pro.proExpDate}</td>
					
					<td> <img src = "data:image/jpeg;base64,${Base64.getEncoder().encodeToString(pro.proImage) }" alt ="product image" style = "max-width : 100px; max-height: 100px;" >
					</td>
					
					<td> <audio controls src = "data:image/jpeg;base64,${Base64.getEncoder().encodeToString(pro.proAudio) }" alt ="product audio"  >
					</td>
					
					<td> <video controls src = "data:image/jpeg;base64,${Base64.getEncoder().encodeToString(pro.proVideo) }" alt ="product video"  >
					</td>
					
					<td>
					<a class = "btn btn-danger" href = "./DeleteProductServlet?proId=${pro.proId}">Delete</a>
					<a class = "btn btn-primary" href = "./EditProductServlet?proId=${pro.proId }">Edit</a>
				
				</td>
				
				
				</tr>
				</a:forEach>
			</tbody>	
				 
	</table>

</body>
</html>