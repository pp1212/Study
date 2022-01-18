package com.sist.dao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/sist/exam/beans.xml");
		MemberDAO dao = (MemberDAO)context.getBean("dao");
		dao.insert();
	}

}
