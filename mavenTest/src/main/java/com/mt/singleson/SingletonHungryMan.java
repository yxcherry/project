package com.mt.singleson;

public class SingletonHungryMan {
	
	public final static SingletonHungryMan INSTANCE = new SingletonHungryMan();
	private SingletonHungryMan() {}
	public void sayHello() {
		System.out.println("say hello");
	}

}
