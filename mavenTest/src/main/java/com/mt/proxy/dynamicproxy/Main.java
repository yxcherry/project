package com.mt.proxy.dynamicproxy;

public class Main {

	public static void main(String[] args) {
		DynamicProxy dynamicProxy = new DynamicProxy(new HelloImpl());
		Hello helloProxy = dynamicProxy.getProxy();	
		helloProxy.sayHi("jack");
		helloProxy.sayBye("Tom");
	}

}
