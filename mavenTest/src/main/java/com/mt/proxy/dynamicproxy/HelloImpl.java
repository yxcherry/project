package com.mt.proxy.dynamicproxy;

public class HelloImpl implements Hello {

	@Override
	public void sayHi(String name) {
		System.out.println("Hello!" + name);
		
	}

	@Override
	public void sayBye(String name) {
		System.out.println("Bye Bye!" + name);
		
	}

}
