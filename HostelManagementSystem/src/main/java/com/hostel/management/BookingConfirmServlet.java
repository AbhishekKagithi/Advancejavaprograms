package com.hostel.management;

import java.io.IOException;
//import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/BookingConfirmServlet")
@MultipartConfig
public class BookingConfirmServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	final String senderEmailId = "mdebashis46";
	final String senderPassword = "vcmi groz acez anlx";
	final String emailSMTPserver = "smtp.gmail.com";
	final String emailServerPort = "465";

	static String emailSubject = "Booking Details";

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String username = (String) request.getAttribute("username");
		String RecieverEmailId = (String) request.getAttribute("email");
		String typeOfRoom = (String) request.getAttribute("type");
		int rentPerDay = (int) request.getAttribute("rentPerDay");
		LocalDate checkInDate = (LocalDate) request.getAttribute("checkInDate");
		LocalDate checkOutDate = (LocalDate) request.getAttribute("checkOutDate");
		int duration = (int) request.getAttribute("duration");
		double totalRent = (double) request.getAttribute("totalRent");
		double cgst = (double) request.getAttribute("cgst");
		double sgst = (double) request.getAttribute("sgst");
		double discount = (double) request.getAttribute("discount");
		double totalPrice = (double) request.getAttribute("totalPrice");

		String emailBody = "Booking Successful:\n" + "Type of Room: " + typeOfRoom + "\nRent Per Day: " + rentPerDay
				+ "\nCheck-In Date: " + checkInDate + "\nCheck-Out Date: " + checkOutDate + "\nDuration: " + duration
				+ "\nTotal Room Rent: " + totalRent + "\nCGST: " + cgst + "\nSGST: " + sgst + "\nDiscount: " + discount
				+ "\nTotal Amount to Pay: " + totalPrice;

		response.setContentType("text/html");
	//	PrintWriter pw = response.getWriter();

		Properties props = new Properties();
		props.put("mail.smtp.user", senderEmailId);
		props.put("mail.smtp.host", emailSMTPserver);
		props.put("mail.smtp.port", emailServerPort);
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.socketFactory.port", emailServerPort);
		props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
		props.put("mail.smtp.socketFactory.fallback", "false");

		try {
			SMTPAuthenticator auth = new SMTPAuthenticator();
			Session session = Session.getInstance(props, auth);
			MimeMessage msg = new MimeMessage(session);
			msg.setText(emailBody);
			msg.setSubject("Booking details");
			msg.setFrom(new InternetAddress(senderEmailId));
			msg.addRecipient(Message.RecipientType.TO, new InternetAddress(RecieverEmailId));
			Transport.send(msg);
			System.out.println("Message Sent Successfully");

		} catch (Exception e) {
			e.printStackTrace();
		}

		request.setAttribute("username", username);
		request.setAttribute("typeOfRoom", typeOfRoom);
		request.setAttribute("rentPerDay", rentPerDay);
		request.setAttribute("checkInDate", checkInDate);
		request.setAttribute("checkOutDate", checkOutDate);
		request.setAttribute("duration", duration);
		request.setAttribute("totalRent", totalRent);
		request.setAttribute("cgst", cgst);
		request.setAttribute("sgst", sgst);
		request.setAttribute("discount", discount);
		request.setAttribute("totalPrice", totalPrice);

		RequestDispatcher dispatcher = request.getRequestDispatcher("bookingConfirmation.jsp");
		dispatcher.include(request, response);

		RequestDispatcher dispatcher1 = request.getRequestDispatcher("billingInfo.jsp");
		dispatcher1.include(request, response);

	}

	public class SMTPAuthenticator extends Authenticator {
		public PasswordAuthentication getPasswordAuthentication() {
			return new PasswordAuthentication(senderEmailId, senderPassword);
		}
	}

}
