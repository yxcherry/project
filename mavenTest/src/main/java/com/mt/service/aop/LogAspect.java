package com.mt.service.aop;

import java.lang.reflect.Method;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogAspect {
	
//	@Pointcut("@annotation(com.mt.service.aop.Action)")
//	public void annotationPointCut() {}
	
	//@Around("annotationPointCut()")
	@Around("execution(* com.mt.service.aop.DemoAnnotationService.*(..))")
	public void after(JoinPoint joinPoint) {
		MethodSignature signature = (MethodSignature)joinPoint.getSignature();
		Method method = signature.getMethod();
		Action action = method.getAnnotation(Action.class);
		System.out.println("注解式拦截----> " + action.name());
	}
	
	@Around("execution(* com.mt.service.aop.DemoMethodService.*(..))")
	public void before(JoinPoint joinPoint) {
		MethodSignature signature = (MethodSignature)joinPoint.getSignature();
		Method method = signature.getMethod();
		System.out.println("方法式拦截 ---->" + method.getName());
	}

}
