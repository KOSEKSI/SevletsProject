package com.koseksi.vo;

import java.util.Date;

public class EmailDetailsVo {
	private String senderMailId=null;
	private String subject=null;
	private String message=null;
	private Date currentdate=null;
	private Date currentTime=null;
	
	public EmailDetailsVo() {
		
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

	public void setSenderMailId(String senderMailId ) {
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
		return "EmailDetailsVo [senderMailId=" + senderMailId + ", subject=" + subject + ", message=" + message
				+ ", currentdate=" + currentdate + ", currentTime=" + currentTime + "]";
	}

	
	
}
