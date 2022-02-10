package com.example.demo;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class SistConfig implements WebMvcConfigurer{

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		// TODO Auto-generated method stub
		//WebMvcConfigurer.super.addInterceptors(registry);
		registry.addInterceptor(new SistInterceptor())
		.addPathPatterns("/hello","/list","/member/**","/shop/**")		//hello,list,member에 있는 모든 것,에 대해서 인터셉터 동작시켜라 
		.excludePathPatterns("/member/menu3","/shop/image/**");		//제외시키고자 하는 서비스명
	}
}
