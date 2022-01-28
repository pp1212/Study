package com.example.demo.commons;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

//@Aspect -> AOP 설정
@Component
@Aspect	
public class ControllerLogging {
	
//	@Pointcut("execution(public * com.example.demo.controller..*(..))")
//	public void mypoint() {
//	}
//	
//	@Around("mypoint()")
//	public Object around(ProceedingJoinPoint joinPoint) {
//		//String methodName = joinPoint.getSignature().toLongString();
//		String methodName = joinPoint.getSignature().toShortString();
//		System.out.println(methodName + "동작하기 전입니다.");
//		long start = System.currentTimeMillis();
//		Object re = null;
//		try{
//			re = joinPoint.proceed();
//			//타깃이 되는 메소드 호출
//			//이 명령어를 기준으로 위쪽에 작성하면 타킷이 작동하기 동작하기 전에 수행하고
//			//이 명령어 아래쪽에 작성하면 타깃이 동작한 후에 수행
//		}catch (Throwable e) {
//			// TODO: handle exception
//		}
//		
//		long end = System.currentTimeMillis();
//		System.out.println(methodName + "동작한 후입니다.");
//		System.out.println("걸린시간:"+(end-start));
//		return re;
//	}
	
	
	
//	@Before("mypoint()")
//	public void pro() {
//		System.out.println("로깅입니다.");  //공통관심사항이라고 생각
//	}
	
	
	//@After -> 타깃이 실행 한 후
//	@After("mypoint()")
//	public void pro2() {
//		System.out.println("변경된 로깅입니다.");
//	}
}
