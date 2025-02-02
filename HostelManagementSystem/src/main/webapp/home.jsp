<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>


<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Responsive Navigation Bar</title>
<!-- Bootstrap CSS -->
<link
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"
	rel="stylesheet">
<style>
/* Additional CSS for background images with hover */
.image-sections {
	display: flex;
	flex-wrap: wrap;
	justify-content: space-between;
	/* Arrange sections with space between */
	margin-bottom: 20px; /* Add spacing between sections */
}

.image-section {
	flex: 1; /* Make sections flexible to take equal space */
	position: relative;
	height: 100vh; /* Cover the entire viewport height */
	background-size: cover;
	background-position: center;
	overflow: hidden; /* Hide overflowing content */
	border-radius: 10px; /* Add border radius for rounded corners */
	margin-bottom: 20px; /* Add margin between sections */
	padding: 20px; /* Add padding to create boxed appearance */
}

.overlay {
	position: absolute;
	top: 0;
	left: 0;
	width: 100%;
	height: 100%;
	background-color: rgba(0, 0, 0, 0.5);
	/* Semi-transparent black overlay */
	display: flex;
	flex-direction: column; /* Arrange details from top to bottom */
	justify-content: center;
	align-items: center;
	opacity: 0;
	transition: opacity 0.3s; /* Smooth transition */
}

.overlay h2 {
	color: #fff;
	font-size: 24px;
	text-align: center;
	margin-bottom: 10px; /* Add spacing between title and content */
}

.overlay div {
	max-width: 300px;
	margin: 0 auto;
	color: #fff;
	text-align: center; /* Center the content */
}

.overlay ol {
	padding-left: 0; /* Remove default padding */
	list-style: none; /* Remove default list style */
}

.overlay ol li {
	margin-bottom: 5px;
}

.image-section:hover .overlay {
	opacity: 1;
}

 /* Animation for sliding effect */
    @keyframes slideBackground {
      0% {
        background-position: 0 0;
      }
      100% {
        background-position: 100% 0;
      }
    }
.image-section {
	animation: slideBackground 10s linear infinite;
	/* Adjust animation duration and timing as needed */
}

/* Additional CSS for horizontal navbar */
.navbar {
	background-color: #9370DB; /* Medium Purple */
}

.navbar-brand img {
	max-width: 50px; /* Adjust logo size */
}

/* Additional CSS for container */
.container-content {
	padding: 20px;
	text-align: center;
}

/* Additional CSS for buttons */
.btn {
	margin-top: 20px; /* Add spacing between buttons */
}

/* Additional CSS for navbar links */
.nav-link {
	color: #fff; /* White text color */
}

.nav-link:hover {
	color: #f8f9fa; /* Lighter text color on hover */
}

/* Additional CSS for image section */
.image-sections {
	padding: 0 20px; /* Add padding to image sections container */
}

.image-section h2 {
	margin-bottom: 20px; /* Add spacing below section headings */
}
</style>
</head>
<body>
	<nav class="navbar navbar-expand-lg navbar-dark">
		<div class="container">
			<a class="navbar-brand" href="#"> <img src="images/hostel.jpeg"
				alt="Logo">
			</a>
			<button class="navbar-toggler" type="button" data-toggle="collapse"
				data-target="#navbarNav" aria-controls="navbarNav"
				aria-expanded="false" aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="navbarNav">
				<ul class="navbar-nav ml-auto">
					<li class="nav-item active"><a class="nav-link" href="welcome_page.jsp">Home</a>
					</li>
					<li class="nav-item active"><a class="nav-link"
						href="PreviousBookingServlet?username=<%=request.getParameter("username")%>">Previous Bookings</a></li>
					<li class="nav-item active"><a class="nav-link" href="#">About
							Us</a></li>
							
				</ul>
			</div>
		</div>
	</nav>

	<div class="container-content">
		<h1>Welcome to our Hostel Sathya!</h1>
		<p style="font-weight: bold; font-size: 18px; color: #555;">Warden:
			Ratan sir</p>

	</div>

	<!-- Image sections container -->
	<div class="container-fluid image-sections">
		<section class="image-section"
			style="background-image: url('images/luxury.jpeg');">
			<div class="overlay">

				<h2>Luxury Deluxe Room</h2>
				<h4 style="color: lime;">Available Rooms:${luxuryRooms}</h4>
				<div>
					<ol>
						<li>Free Wi-Fi</li>
						<li>Smart TV</li>
						<li>Hot Water</li>
						<li>AC</li>
						<li>King Size Bed</li>
						<li>Only Two people for one Room</li>
					</ol>
				</div>
				<h2>Price: Rs.800/day</h2>
				<%
				int price1 = 800;
				session.setAttribute("price1", price1);
				%>
				<a href="book.jsp?type=luxury" class="btn btn-primary">BOOK HERE</a>
			</div>
		</section>

		<section class="image-section"
			style="background-image: url('images/deluxe.jpeg');">
			<div class="overlay">
				<h2>Deluxe Room</h2>
				<h4 style="color: lime;">Available Rooms:${deluxeRooms}</h4>
				<div>
					<ol>
						<li>Free Wi-Fi</li>
						<li>Smart TV</li>
						<li>Hot Water</li>
						<li>Iron Bed</li>
						<li>Only three people for one Room</li>
					</ol>
				</div>
				<h2>Price: Rs.500/day</h2>
				<%
				int price2 = 500;
				session.setAttribute("price2", price2);
				%>
				<a href="book.jsp?type=deluxe" class="btn btn-primary">BOOK HERE</a>
			</div>
		</section>

		<section class="image-section"
			style="background-image: url('images/normal.jpeg');">
			<div class="overlay">
				<h2>Normal Rooms</h2>
				<h4 style="color: lime;">Available Rooms:${normalRooms}</h4>
				<div>
					<ol>
						<li>Free Wi-Fi</li>
						<li>Normal rooms</li>
						<li>Only Five people for one Room</li>
					</ol>
				</div>

				<h2>Price: Rs.300/day</h2>
				<%
				int price3 = 300;
				session.setAttribute("price3", price3);
				%>
				<%
				String username = request.getParameter("username");
				request.setAttribute("username", username);
				session.setAttribute("username", username);
				%>

				<a href="book.jsp?type=normal" class="btn btn-primary">BOOK HERE</a>
			</div>
		</section>
	</div>

	<!-- Bootstrap JS and jQuery -->
	<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.4/dist/umd/popper.min.js"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>
