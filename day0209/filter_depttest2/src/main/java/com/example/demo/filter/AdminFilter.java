package com.example.demo.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Component;

/**
 * Servlet Filter implementation class AdminFilter
 */
@Component
//@WebFilter("/AdminFilter")
public class AdminFilter extends HttpFilter implements Filter {
       
    /**
     * @see HttpFilter#HttpFilter()
     */
    public AdminFilter() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here
		
		//세션에 설정된 role이 admin인지 판별하여
		//일치하다면 요청한 서비스로 보내고
		//그렇지 않다면 사용자가 다시 로그인하도록 로그인 페이지로 보내도록 함
		
//		String role = null;
		HttpSession session = ((HttpServletRequest)request).getSession();
//		role = (String)session.getAttribute("role");
		//위 3줄과 같은 방법
		String role = (String)((HttpServletRequest)request).getSession().getAttribute("role");
		
		//role이 null이 아니고 admin인지 판별
		if(role != null && role.equals("admin")) {
			chain.doFilter(request, response);
		}else {
			session.setAttribute("re", 403);	//권한이 없으면 세션에 re를 403으로 설정 
			((HttpServletResponse)response).sendRedirect("/login");
		}
		
		
		
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
