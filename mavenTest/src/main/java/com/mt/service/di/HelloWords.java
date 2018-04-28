package com.mt.service.di;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class HelloWords {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context =  new AnnotationConfigApplicationContext(DiConfig.class);

		UseFunctionService functionService = context.getBean(UseFunctionService.class);
		System.out.println(functionService.sayHello("diConfig"));
		context.close();
	}

}
