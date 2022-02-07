package com.example.demo;

import java.util.Properties;

import org.springframework.context.annotation.Bean;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.stereotype.Component;

//메일 보내기 위한 객체
@Component	//자동으로 생성되기 위해
public class SpringConfig {

	@Bean
	public JavaMailSenderImpl javaMailSender() {
		JavaMailSenderImpl r = new JavaMailSenderImpl();
		r.setHost("smtp.gmail.com");
		r.setPort(587);
		r.setUsername("구글아이디");
		r.setPassword("발급받은패스워드");
		r.setDefaultEncoding("UTF-8");
		
		//부가적인 properties 설정
		Properties prop = new Properties();
		prop.put("mail.smtp.starttls.enable", true);
		prop.put("mail.smtp.auth", true);
		prop.put("mail.smtp.ssl.checkserveridentity", true);
		prop.put("mail.smtp.ssl.trust", "*");
		prop.put("mail.smtp.ssl.protocols", "TLSv1.2");
		
		r.setJavaMailProperties(prop);
		return r;
	}
}
