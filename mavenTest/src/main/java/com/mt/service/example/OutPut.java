package com.mt.service.example;

public interface OutPut {
	void out();
	void getData(String msg);
	default void print(String... msgs) {
		for(String msg : msgs) {
			System.out.println(msg);
		}
	}
	//接口中定义默认方法，需要使用default修饰
	default void test() {
		System.out.println("默认的test()方法");
	}
	static String staticTest() {
		return "接口里的类方法";
	}
}
