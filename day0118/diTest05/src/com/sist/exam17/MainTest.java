package com.sist.exam17;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/sist/exam17/beans17.xml");
		//�� �� �̹� ��ü�� ���� ��
		
		
		Person hong1 = (Person)context.getBean("hong"); 
		Person hong2 = (Person)context.getBean("hong");
		 
		if(hong1 == hong2) { 
			 System.out.println("���� ���� �޸𸮸� �ٶ󺾴ϴ�."); 
		}else {
			System.out.println("���� �ٸ� �޸𸮸� �ٶ󺾴ϴ�."); 
		}
		 
	}

}
