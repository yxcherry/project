package com.mt.service.designpattern.factory;

public class OutPutFactory {
	public OutPut getOutPut() {
		return new Printer();
	}
	
	public static void main(String[] args) {
		OutPutFactory factory = new OutPutFactory();
		Computer computer = new Computer(factory.getOutPut());
		computer.keyIn("java基础");
		computer.keyIn("java高级");
		computer.print();
	}

}
