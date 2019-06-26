package com.koseksi.service;

import com.koseksi.dto.EmailDetailsDto;

public interface SendMailJavaService {

	
	public String sendMail(EmailDetailsDto dto) throws Exception;
}
