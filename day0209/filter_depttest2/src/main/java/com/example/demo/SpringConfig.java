package com.example.demo;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.filter.AdminFilter;
import com.example.demo.filter.InsertFilter;

@Configuration
public class SpringConfig {
	
	@Bean
	public FilterRegistrationBean setFilterRegistrationBean() {
		FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean(new InsertFilter());
		filterRegistrationBean.addUrlPatterns("/insertDept.do");
		return filterRegistrationBean;
	}
	
	//제어가 필요한 서비스마다 메소드 1개 더 만들면 됨
	@Bean
	public FilterRegistrationBean setFilterRegistrationBean2() {
		//admin네임스페이스의 모든 요청일 때 AdminFilter가 동작하도록
		FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean(new AdminFilter());
		filterRegistrationBean.addUrlPatterns("/admin/*");
		return filterRegistrationBean;
	}
}
