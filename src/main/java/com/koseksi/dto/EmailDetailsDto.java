package com.koseksi.dto;

import java.util.Date;

public class EmailDetailsDto {
	private String senderMailId=null;
	private String subject=null;
	private String message=null;
	private Date currentdate=null;
	private Date currentTime=null;
	
	public EmailDetailsDto() {
		
	}

	public String getSenderMailId() {
		return senderMailId;
	}

	
	public String getSubject() {
		return subject;
	}

	public String getMessage() {
		return message;
	}

	public Date getCurrentdate() {
		return currentdate;
	}

	public Date getCurrentTime() {
		return currentTime;
	}

	public void setSenderMailId(String senderMailId) {
		this.senderMailId = senderMailId;
	}

	

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void setCurrentdate(Date currentdate) {
		this.currentdate = currentdate;
	}

	public void setCurrentTime(Date currentTime) {
		this.currentTime = currentTime;
	}

	@Override
	public String toString() {
		return "EmailDetailsDto [senderMailId=" + senderMailId + ", subject=" + subject + ", message=" + message
				+ ", currentdate=" + currentdate + ", currentTime=" + currentTime + "]";
	}
	
	
	

}
