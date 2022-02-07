package com.example.demo;

import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component	//자동 스캔되어야 하니까
@EnableScheduling
public class SistSchedule {
	
	@Scheduled(fixedRate = 10000)	//10초마다 동작
	public void pro() {
		System.out.println("콜! 콜!");
	}
	
	//매일 오전 9시 31분에 동작하도록 
	//@Scheduled(cron=“초 분 시간 일 월 요일 연도")
	@Scheduled(cron = "0 31 9 * * ?")
	public void pro2() {
		System.out.println("pro2");
	}
	
	//매월 7일 9시 35분에 hello를 출력
	@Scheduled(cron = "0 35 9 7 * ?")
	public void pro3() {
		System.out.println("hello");
	}
}
