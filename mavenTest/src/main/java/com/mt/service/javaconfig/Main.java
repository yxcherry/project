package com.mt.service.javaconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context =  new AnnotationConfigApplicationContext(JavaConfig.class);
		UseFunctionService functionService = context.getBean(UseFunctionService.class);

		System.out.println(functionService.sayHello("javaConfig"));
		context.close();
	}

}
