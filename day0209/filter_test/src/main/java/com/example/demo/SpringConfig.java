package com.example.demo;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.example.demo.filter.MemberFilter;
import com.example.demo.filter.SistFilter;

@Configuration
public class SpringConfig implements WebMvcConfigurer {
	
	//객체 제공자로서 메소드
	@Bean
	public FilterRegistrationBean setFilterRegistration() {
									//↑이름 이렇게 해야함
		FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean(new MemberFilter());
																						//만들어 놓은 필터
												//url패턴 설정
		filterRegistrationBean.addUrlPatterns("/member/*");
		//반환
		return filterRegistrationBean;
	}
	
}
