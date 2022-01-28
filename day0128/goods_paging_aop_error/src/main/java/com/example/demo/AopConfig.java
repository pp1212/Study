package com.example.demo;

import javax.servlet.http.HttpServletRequest;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.dao.ExceptionLogDAO;
import com.example.demo.vo.ExceptionLog;

import lombok.Setter;

@Component
@Aspect
@Setter
public class AopConfig {
	
	@Autowired
	private ExceptionLogDAO dao;
	
	//controller에 모든 것에 HttpServletRequest request 이거를 첫번째 매개변수로 넣어줘야 함
	@AfterThrowing(pointcut="execution(public * com.example.demo.dao..*(..))",throwing = "ex")
	public void errorAdvice(JoinPoint joinPoint,Exception ex) {
		String msg = ex.getMessage();
		String uri = ((HttpServletRequest)joinPoint.getArgs()[0]).getRequestURI();
		ExceptionLog log = new ExceptionLog();
		log.setMsg(msg);
		log.setUri(uri);
		
		dao.insert(log);
	}
}
