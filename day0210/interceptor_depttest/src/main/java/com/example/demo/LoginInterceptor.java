package com.example.demo;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

@Component
public class LoginInterceptor extends HandlerInterceptorAdapter {
	
	//흐름을 제어하기 위하여 preHandle 사용
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		// TODO Auto-generated method stub
		
		//기록으로 사용할 때
		String uri = request.getRequestURI();
		String ipAddress = request.getRemoteAddr();
		Date now = new Date();
		System.out.println("uri:"+uri);
		System.out.println("ipAddress:"+ipAddress);
		System.out.println("현재시간:"+now);
		
		
		
		//로그인 했는지 파악하기 위하여 request객체를 통하여 세션을 갖고 와서
		//세션에 userID가 있는지 파악
		//filter와 다르게 ServletRequest가 아니고 HttpServletRequest여서 바로 세션 얻어올 수 있음
		HttpSession session = request.getSession();
		String userID = (String)session.getAttribute("userID");
		
		if(userID != null) {									//만약 로그인 하였다면
			return super.preHandle(request, response, handler);	//요청한 서비스로 이동시키고
		}else {													//그렇지 않다면(로그인 하지 않았다면)
			response.sendRedirect("/login");					//로그인 페이지로 이동
			return false;
		}
	}
}
