package com.example.demo;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class SpringConfig implements WebMvcConfigurer{	//인터셉터를 등록하기 위하여 WebMvcConfigurer 클래스 확장

	@Override
	public void addInterceptors(InterceptorRegistry registry) {	//addInterceptors 메소드를 오버라이딩하여
		// TODO Auto-generated method stub
		//WebMvcConfigurer.super.addInterceptors(registry);
		
		registry.addInterceptor(new LoginInterceptor())			//매개변수 registry 인터셉터로 등록
		.addPathPatterns("/insertDept.do","/member/**");		//insertDept.do와 member의 모든 요청에 대하여 인터셉터가 동작하도록 설정
	
		//새로운 인터셉터 추가하려면
		//registry.addInterceptor(new 새로운인터셉터클래스)
		//.addPathPatterns("새로운패턴");
		
		registry.addInterceptor(new AdminInterceptor())			//AdminInterceptor를 등록
		.addPathPatterns("/admin/**");							//admin네임스페이스의 모든 요청일 때 동작하도록 설정
		
		
		registry.addInterceptor(new DeptLogInterceptor())
		.addPathPatterns("/**")									//전부 적용
		.excludePathPatterns("/login");							//제외
	}
}
