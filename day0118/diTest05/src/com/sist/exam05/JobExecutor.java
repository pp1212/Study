package com.sist.exam05;

public class JobExecutor {
	public JobExecutor(String name,int seconds) {
		System.out.println("������1 ȣ��");
	}
	
	
	public JobExecutor(String name,long seconds) {
		System.out.println("������2 ȣ��");
	}
	public JobExecutor(String name,String seconds) {
		System.out.println("������3 ȣ��");
	}
	
	
	public void pro() {
		System.out.println("JobExecutor�� pro�Դϴ�.");
	}
}
