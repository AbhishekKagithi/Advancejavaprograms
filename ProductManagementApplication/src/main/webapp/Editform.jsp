<%@page import="com.sathya.EditProductServlet" import = "java.util.Base64"%>
<%@ page language="java" contentType="text/html; "
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>

<title>edit the product</title>
</head>
<body>
<div class="container mt-5 text-center">
		<h2 class="text-center font-italic mb-1">Product Details...</h2>
				<form method = "post" action="./UpdateProductServlet" enctype = "multipart/form-data" onsubmit = "return validateForm()">

			<div class="form-group">
				<label class="font-italic font-weight-bold" for="proId"> Product Id:</label> 
				<input type="text" class="form-control-sm" name="proId" id="proId" value = "${ existingProduct.proId}">
			</div>

			<div class="form-group">
				<label class="font-italic font-weight-bold" for="proName">Product
					Name:</label> <input type="text" class="form-control-sm" name="proName"
					id="proName" value = "${existingProduct.proName}">
			</div>

			<div class="form-group">
				<label class="font-italic font-weight-bold" for="proPrice">Product
					Price:</label> <input type="text" class="form-control-sm" name="proPrice"
					id="proPrice" value = "${existingProduct.proPrice}">
			</div>

			<div class="form-group">
				<label class="font-italic font-weight-bold" for="proBrand">Product
					Brand:</label> <input type="text" class="form-control-sm" name="proBrand"
					id="proBrand" value = "${ existingProduct.proBrand}">
			</div>

			<div class="form-group">
				<label class="font-italic font-weight-bold" for="proMadeIn">Product
					Made In:</label> <input type="text" class="form-control-sm" name="proMadeIn"
					id="proMadeIn" value = "${existingProduct.proMadeIn}">
			</div>

			<div class="form-group">
				<label class="font-italic font-weight-bold" for="proMfgDate">MFG.
					Date:</label> <input type="date" class="form-control-sm" name="proMfgDate"
					id="proMfgDate" value = "${existingProduct.proMfgDate}">
			</div>

			<div class="form-group">
				<label class="font-italic font-weight-bold" for="proExpDate">Exp.Date:</label> 
				<input type="date" class="form-control-sm" name="proExpDate"
					id="proExpDate" value = "${existingProduct.proExpDate}">
			</div>

			<div class="form-group">
				<label class="font-italic font-weight-bold" for="proImage">existing Product
					Image:</label><br>
					 <img id = "currentImage"
					 src = "data:image/jpeg;base64,${Base64.getEncoder().encodeToString(existingProduct.proImage)}" alt = "existing Image" style = "max-width:150px;max-height:150px;" >
					 <input type = "hidden" id = "existingImage" name = "existingImage" value= "${existingProduct.proImage}"/>
			</div>
			<div class="form-group">
				<label class="font-italic font-weight-bold" for="proImage">new Product
					Image:</label>
					 
					 <input type = "file" class = "form-control-file-in" id = "newProImage" name = "newProimage" accept = "image"/>
			</div>
			
			<div class="form-group">
				<label class="font-italic font-weight-bold" for="proAudio">existing Product
					Audio:</label><br>
					 <audio controls id = "currentAudio"
					 src = "data:audio/mpeg;base64,${Base64.getEncoder().encodeToString(existingProduct.proAudio)}" alt = "existing Audio"  >
					 <input type = "hidden" id = "existingAudio" name = "existingAudio" value= "${existingProduct.proAudio}"/>
			</div>
			<div class="form-group">
				<label class="font-italic font-weight-bold" for="proAudio">new Product
					Audio:</label>
					 
					 <input type = "file" class = "form-control-file-in" id = "newProAudio" name = "newProAudio" accept = "Audio"/>
			</div>
			
			<div class="form-group">
				<label class="font-italic font-weight-bold" for="proVideo">existing Product
					Image:</label><br>
					 <video controls id = "currentVideo"
					 src = "data:video/mp4;base64,${Base64.getEncoder().encodeToString(existingProduct.proVideo)}" alt = "existing Image"  >
					 <input type = "hidden" id = "existingVideo" name = "existingVideo" value= "${existingProduct.proVideo}"/>
			</div>
			<div class="form-group">
				<label class="font-italic font-weight-bold" for="proVideo">new Product
					Video:</label>
					 
					 <input type = "file" class = "form-control-file-in" id = "newProVideo" name = "newProVideo" accept = "video"/>
			</div>

			<div>
				<input type="submit" class="btn btn-success" value="Update"/>
				
			</div>
		</form>
		</div>
</body>
</html>