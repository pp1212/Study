package com.sist.exam04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/sist/exam04/beans04.xml");
		DeptDao deptDao = (DeptDao)context.getBean("deptDao");
		deptDao.insert();
	}

}
