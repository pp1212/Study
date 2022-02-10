package com.example.demo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

@Component
public class SistInterceptor extends HandlerInterceptorAdapter {
	
	//Log(기록)을 남기는 용도로 인터셉터를 사용한다면 어떤 메소드를 사용해도 상관 없으나
	//흐름을 제어하는 용도로 사용한다면 preHandle 메소드 사용 권장
	
	

	@Override					//↓사용자의 정보 파악 가능 
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		// TODO Auto-generated method stub
		Thread.sleep(500);		//예외처리 되어있어서 안 해도 됨
		System.out.println("요청처리 전입니다.");
		Thread.sleep(500);
		return super.preHandle(request, response, handler);
		//사용자의 상황에 따라 흐름을 제어하는 용도로 인터셉터를 사용한다면
		//사용자의 요청으로 이동시키지 않으려면 false를 반환
		//사용자의 요청으로 이동시키려면 다음의 메소드를 호출한 결과를 반환 return super.preHandle(request, response, handler);
		//매개변수 request 통해서 사용자의 정보를 파악할 수 있음 ex)ip주소,서비스명 등
		
		//요청한 곳으로 반환하는 것 -> 실행을 제어하는 용도로 인터셉터를 사용한다면 보내지 않을 때:boolean의 false, 보낼 때:return super.preHandle(request, response, handler);
	}

	
	
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// TODO Auto-generated method stub
		Thread.sleep(500);
		System.out.println("요청메소드 진입입니다.");
		Thread.sleep(500);
		super.postHandle(request, response, handler, modelAndView);
	}

	
	//메소드를 다 실행하고 뷰로 가기전에 동작하는 거라 흐름을 제어하는 용도로 사용하기에는 부적합
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// TODO Auto-generated method stub
		System.out.println("View로 가기 전입니다.");
		Thread.sleep(1000);
		super.afterCompletion(request, response, handler, ex);
		//이 메소드는 뷰로 이동하기 직전에 동작하는 메소드
		//이 요청에 따른 컨트롤러의 메소드안의 내용은 모두 수행한 시점이어서
		//흐름을 제어하는 용도로 사용하기에는 부적합
	}
}
