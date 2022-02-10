package com.example.demo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

@Component
public class AdminInterceptor extends HandlerInterceptorAdapter {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		// TODO Auto-generated method stub
		
		HttpSession session = request.getSession();				//request를 통하여 세션변수를 받아옴
		String role = (String)session.getAttribute("role");		//세션에 저장된 role을 읽어옴
		
		//반드시 이 경우에는 null이 아닌지 묻는게 먼저!!순서 중요!
		if(role != null && role.equals("admin")) {				//세션변수 role이 null이 아니고 admin이라면 
			return super.preHandle(request, response, handler);	//요청한 서비스로 이동시킴
		}else {													//세션변수 role이 null이거나 admin이 아니라면
			response.sendRedirect("/login");					//다시 login하는 곳으로 보냄
			return false;										//false를 반환
		}
	}
}
