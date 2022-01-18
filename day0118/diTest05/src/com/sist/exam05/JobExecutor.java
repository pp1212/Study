package com.sist.exam05;

public class JobExecutor {
	public JobExecutor(String name,int seconds) {
		System.out.println("생성자1 호출");
	}
	
	
	public JobExecutor(String name,long seconds) {
		System.out.println("생성자2 호출");
	}
	public JobExecutor(String name,String seconds) {
		System.out.println("생성자3 호출");
	}
	
	
	public void pro() {
		System.out.println("JobExecutor의 pro입니다.");
	}
}
