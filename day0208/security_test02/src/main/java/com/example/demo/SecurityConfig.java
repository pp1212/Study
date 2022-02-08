package com.example.demo;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

//"인증"과"인가"를 위하여 스프링 시큐리티가 제공하는 WebSecurityConfigurerAdapter를 상속받은 클래스 만듬
//configure라는 메소드를 오버라이딩하여 시큐리티 환경설정을 함
@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		// TODO Auto-generated method stub
		//super.configure(http);
		
		//인증에 대한 설정들
		//configure메소드의 HttpSecurity의 http매개변수를 통해 환경설정
		http.authorizeHttpRequests()
		.mvcMatchers("/","/join","/login","/all/**").permitAll()	//이 요청들은 인증(로그인) 없이 사용 가능, 로그인을 하지 않아도 될 서비스들을 설정
														//만약 서비스들이 많다면 namespace줘서 한 번에 설정(/admin/**처럼)
		.mvcMatchers("/admin/**").hasRole("admin")		//  /admin으로 시작하는 페이지는 db의 role이 admin이어야 사용 가능
														//,admin 네임스페이스에 있는 모든 요청은 admin 권한이 있어야 가능함을 설정(인가)
		.anyRequest().authenticated();					//이외의 요청들은 인증을 해야만 사용 가능,그 나머지 요청은 인증(로그인)을 해야 서비스 받을 수 있음을 설정
		
		//스프링이 제공하는 로그인 폼 말고 우리가 로그인 폼 생성
		//스프링 시큐리티를 사용하겠다고 의존관계를 설정하면 스프링 시큐리티가 로그인폼을 제공함
		//만약,  자신이 만든 로그인폼을 사용하려면 다음과 같이 설정
		http.formLogin().loginPage("/login")			//로그인을 위한 서비스명 설정  ->MemberController->login.jsp->post방식 시큐리티가 해줌
		.defaultSuccessUrl("/loginOK");					//로그인 성공하였을 때 이동할 서비스명 설정 ==> 로그인을 성공했을 때 이동하는 컨트롤러에서 로그인한 회원의 정보를 상태유지하는 코드 작성
		//이때 로그인을 위한 get방식에 대한 컨트롤러와 viewPage까지만 사용자가 만듬
		//login에 대한 post방식에 대한 처리는 사용자가 따로 하지 않음
		//이것은 스프링 시큐리티가 처리
		//로그인을 위한 form태그에서 아이디와 암호를 입력하고 submit버튼을 누르면
		//자동으로 UserDetailsService 인터페이스를 구현한 클래스의 loadUserByUsername메소드가 자동으로 동작
		
		
		
		
		
		//로그아웃을 위하여 서비스명만 설정하면
		//실제 로그아웃에 대한 처리는 스프링시큐리티가 처리 해 줌
		http.logout()
		.logoutRequestMatcher(new AntPathRequestMatcher("/logout"))	//로그아웃을 위한 서비스명을 설정
		.invalidateHttpSession(true)					//로그아웃을 완료하였을 때 세션 파기 여부
		.logoutSuccessUrl("/login");					//로그아웃을 완료한 후에 이동할 서비스명 설정
		
		http.httpBasic();								//나머지 사항들은 http 설정의 기본을 따르도록 설정
	}
	
	
}
