package com.koseksi.service;

import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import com.koseksi.constants.ProgramConstants;
import com.koseksi.dto.EmailDetailsDto;

public class SendMailJavaServiceImpl implements SendMailJavaService {

	public SendMailJavaServiceImpl() {

	}

	public String sendMail(EmailDetailsDto dto) throws Exception {

		Properties prop=ProgramConstants.getConstants();
		final String mailid=prop.getProperty("sender.mailid");
		final String pass=prop.getProperty("sender.password");
		final String address=prop.getProperty("sender.mailaddress");
		final String smail=dto.getSenderMailId();
		final String body=dto.getMessage();
		final String subject=dto.getSubject();
		
		Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.port", "587");
		props.put("mail.smtp.ssl.trust", "*");
		

		Session session = Session.getInstance(props, new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(mailid, pass);
			}
		});

		

			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress(address));
			message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(smail));
			message.setSubject(subject);
			message.setText(body);

			Transport.send(message);

			System.out.println("Done");

		

		return null;
	}

}
