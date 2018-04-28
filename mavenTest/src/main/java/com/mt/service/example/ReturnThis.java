package com.mt.service.example;

public class ReturnThis {

	public int age;
	private String dd;
	public ReturnThis grow() {
		age++;
		return this;
	}
	public static void main(String[] args) {
		ReturnThis returnThis = new ReturnThis();
		returnThis.grow()
		      .grow()
		      .grow()
		      .grow();
		System.out.println(returnThis.age);

	}

}
