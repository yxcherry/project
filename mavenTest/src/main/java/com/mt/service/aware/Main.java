package com.mt.service.aware;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext contex = new AnnotationConfigApplicationContext(AwareConfig.class);
		AwareService awareService = contex.getBean(AwareService.class);
		awareService.outputResult();
		contex.close();
	}

}
