package com.example.demo.commons;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AopConfig {
	
	//예외에 대한 정보도 알고 싶고
	//타깃메소드에 대한 정보도 알고 싶을 때
	//반드시 JoinPoint를 첫 번째 매개변수로 두어야 함
	@AfterThrowing(pointcut="execution(public * com.example.demo.dao..*(..))", throwing="ex")
	public void afterError(JoinPoint joinPoint, Exception ex) {
		String methodName = joinPoint.getSignature().toShortString();
		System.out.println("----------------------------------");
		System.out.println(methodName + "메소드에서 다음의 예외가 발생하였습니다.");
		System.out.println(ex.getMessage());
		System.out.println("----------------------------------");
	}
	
	
	
	
	
//	@Pointcut("execution(public * com.example.demo.dao..*(..))")	//타깃을 정하는 것 -> *하면 모든 것이 타깃
//	public void daoPoint() {}
	
	//타깃이 되는 메소드가 오류가 났을때
	//그 오류의 정보를 파악하고 싶음
	//매개변수를 하나 더 받아오면 됨
	
//	@AfterThrowing(pointcut="execution(public * com.example.demo.dao..*(..))", throwing="ex")
//	public void afterError( Exception ex) {
//		System.out.println("----------------------------------");
//		System.out.println("타깃메소드에서 다음의 예외가 발생하였습니다.");
//		System.out.println(ex.getMessage());
//		System.out.println("----------------------------------");
//	}
	
	
	
	
	//타깃이 되는 메소드만 정상적으로 종료하거나
	//오류가 나거나
	//반드시 동작하는 어드바이스
	/*
	@After("daoPoint()")
	public void after(JoinPoint joinPoint) {
		String methodName = joinPoint.getSignature().toShortString();
		System.out.println(methodName + "메소드가 종료되었습니다.");
	}
	*/
	
	
	/*
	@AfterThrowing("daoPoint()")
	public void afterError(JoinPoint joinPoint) {
		String methodName = joinPoint.getSignature().toShortString();
		System.out.println(methodName + "가 비정상 종료되었습니다.");
	}
	*/
	
	
	
	/*타깃이 되는 메소드가 오류없이 정상적으로 완료되었을 때 동작하는 어드바이스
	@AfterReturning("daoPoint()")	
	public void afterOK(JoinPoint joinPoint) {
		String methodName = joinPoint.getSignature().toShortString();
		System.out.println(methodName + " 동작 후 입니다.");
	}
	*/
	
	/*
	@Pointcut("execution(public int com.example.demo.dao..*(..))")	//타깃을 정하는 것 -> int하면 반환값이 int인 것이 타깃
	public void daoPoint() {}
	
	@After("daoPoint()")
	public void after() {
		System.out.println("타킷 메소드 동작 후 입니다.");
	}
	*/
}
