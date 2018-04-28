package com.mt.service.taskexecutor;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TaskExecutorConfig.class);
		AsyncService asyncService = context.getBean(AsyncService.class);
		for (int i=1;i<10;i++) {
			asyncService.executeAsyncTask(i);
			asyncService.executeAsyncTaskPlus(i);
		}
		context.close();
	}

}
