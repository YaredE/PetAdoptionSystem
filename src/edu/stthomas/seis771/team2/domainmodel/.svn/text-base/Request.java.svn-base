package edu.stthomas.seis771.team2.domainmodel;

import java.util.Date;
import java.util.Properties;

import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;
import javax.activation.*;

import  edu.stthomas.seis771.team2.server.IRequestType;

public class Request 
{
	
	
	private Date requestDate;
	
	
	private User submitter;
	
	
	private Employee assignedEmployee;
	
	
	private Status status;
	
	
	private IRequestType typeOfRequest;


	public Date getRequestDate() {
		return requestDate;
	}


	public void setRequestDate(Date requestDate) {
		this.requestDate = requestDate;
	}


	public Employee getAssignedEmployee() {
		return assignedEmployee;
	}


	public void setAssignedEmployee(Employee assignedEmployee) {
		this.assignedEmployee = assignedEmployee;
	}


	public Status getStatus() {
		return status;
	}


	public void setStatus(Status status) {
		this.status = status;
	}


	public IRequestType getTypeOfRequest() {
		return typeOfRequest;
	}


	public void setTypeOfRequest(IRequestType typeOfRequest) {
		this.typeOfRequest = typeOfRequest;
	}


	public User getSubmitter() {
		return submitter;
	}


	public void setSubmitter(User submitter) {
		this.submitter = submitter;
	}
	
	
	public void sendNotification ()
	{
		this.getAssignedEmployee().getEmailAddress();
		// Recipient's email ID needs to be mentioned.
		String to = "abcd@gmail.com";

		// Sender's email ID needs to be mentioned
		String from = "web@gmail.com";

		// Assuming you are sending email from localhost
		String host = "localhost";

		// Get system properties
		Properties properties = System.getProperties();

		// Setup mail server
		properties.setProperty("mail.smtp.host", host);

		// Get the default Session object.
		Session session = Session.getDefaultInstance(properties);

		try {
			// Create a default MimeMessage object.
			MimeMessage message = new MimeMessage(session);

			// Set From: header field of the header.
			message.setFrom(new InternetAddress(from));

			// Set To: header field of the header.
			message.addRecipient(Message.RecipientType.TO, new InternetAddress(
					to));

			// Set Subject: header field
			message.setSubject("This is the Subject Line!");

			// Now set the actual message
			message.setText("This is actual message");

			// Send message
			Transport.send(message);
			System.out.println("Sent message successfully....");
		} catch (MessagingException mex) {
			mex.printStackTrace();
		}
	}
}