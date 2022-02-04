package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.Setter;

@Controller
@Setter
public class MailController {
	
	@Autowired
	private MailSender javaMailSender;	//아까 만든거랑 이름을 맞춰야 함
	
	
	@RequestMapping("/sendMail")
	@ResponseBody
	public String mail() {
		
		SimpleMailMessage mailMessage = new SimpleMailMessage();
		mailMessage.setSubject("회원가입안내");			//메일 제목
		mailMessage.setFrom("구글계정이메일");	//구글 계정의 메일 주소
		mailMessage.setTo("받을이메일");	//받는 사람 이메일 주소
		mailMessage.setText("회원가입을 환영합니다.");	//메일 내용
		try {
			javaMailSender.send(mailMessage);
		} catch (Exception e) {
			System.out.println("예외발생:"+e.getMessage());
		}
		return "메일을 발송하였습니다.";
	}
}
