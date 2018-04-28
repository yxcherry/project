package com.mt.service.designpattern.factory;

public class Computer {

	private OutPut outPut;
	public Computer(OutPut outPut) {
		this.outPut = outPut;
	}
	
	public void keyIn(String msg) {
		outPut.getData(msg);
	}
	
	public void print() {
		outPut.out();
	}
}
