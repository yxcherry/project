package com.mt.proxy.staticproxy;

public class Main {

	public static void main(String[] args) {
		Hello helloProxy = new HelloProxy();
		helloProxy.say("jack");

	}

}
