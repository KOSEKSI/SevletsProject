package com.koseksi.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.koseksi.dto.EmailDetailsDto;
import com.koseksi.service.SendMailJavaService;
import com.koseksi.service.SendMailJavaServiceImpl;
import com.koseksi.vo.EmailDetailsVo;

public class SendMailController extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private EmailDetailsVo vo=null;
	private EmailDetailsDto dto=null;
	private Calendar cal=null;
	private  SendMailJavaService service=null;
	public SendMailController() {
		//no body
	}
	@Override
	public void init() throws ServletException {
		
		vo=new EmailDetailsVo();
		cal=Calendar.getInstance();
		dto=new EmailDetailsDto();
		service=new SendMailJavaServiceImpl();
			
	}

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
			PrintWriter pw=res.getWriter();
			res.setContentType("text/html");
			vo.setSenderMailId(req.getParameter("sendmailid"));
			vo.setSubject(req.getParameter("subject"));
			vo.setMessage(req.getParameter("message"));
		
			vo.setCurrentdate(new Date());
			vo.setCurrentTime(cal.getTime());
			
			dto.setCurrentdate(vo.getCurrentdate());
			dto.setCurrentTime(vo.getCurrentTime());
			dto.setSenderMailId(vo.getSenderMailId());
			dto.setSubject(vo.getSubject());
			dto.setMessage(vo.getMessage());
			
			System.out.println(vo);
			System.out.println(dto);
			String result;
			try {
				result = service.sendMail(dto);
				pw.println(result);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			

	}



	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		doGet(req, resp);
	}

}
