package com.sist.exam18;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ApplicationContext context = new ClassPathXmlApplicationContext("com/sist/exam18/beans18.xml");
		
		//Monitor monitor = (Monitor)context.getBean("monitor");		싱글톤이라서 안해도 됨
		//monitor.start();		하지 않아도 자동으로 동작하도록 하기 위해서 -> init-method="함수"
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/sist/exam18/beans18.xml");
		try {
			Thread.sleep(2000);
		}catch (Exception e) {
			// TODO: handle exception
		}
		context.close();
		
	}

}
