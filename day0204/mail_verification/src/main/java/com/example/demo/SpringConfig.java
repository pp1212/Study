package com.example.demo;

import java.util.Properties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;

@Configuration
public class SpringConfig {
	
	//객체 제공자 입니다라는 뜻
	@Bean
	public JavaMailSenderImpl javaMailSender() {
		JavaMailSenderImpl r = new JavaMailSenderImpl();
		r.setHost("smtp.gmail.com");
		r.setPort(587);
		r.setUsername("구글계정아이디");
		r.setPassword("발급받은패스워드");
		r.setDefaultEncoding("UTF-8");
		
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
