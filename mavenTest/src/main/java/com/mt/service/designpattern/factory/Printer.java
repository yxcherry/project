package com.mt.service.designpattern.factory;

public class Printer implements OutPut {
	private static int MAX_SIZE =3;
	private String[] printData = new String[MAX_SIZE];
	private int dataNum = 0;

	@Override
	public void out() {
		while(dataNum > 0) {
			System.out.println("打印机打印：" + printData[0]);
			System.arraycopy(printData, 1, printData, 0, --dataNum);
		}
	}
	
	@Override
	public void getData(String msg) {
		if(dataNum >= MAX_SIZE) {
			System.out.println("输出队列已满，添加失败");
		} else {
			printData[dataNum++] = msg;
		}
	}
	
	
	public static void main(String[] args) {
/*		OutPut o = new Printer();
		o.getData("hah");
		o.getData("xixi");
		o.out();
		o.getData("wowo");
		o.getData("lulu");
		o.out();
		o.print("唐僧","孙悟空","猪八戒");
		o.test();*/
		int length = 7;
		int[] fun ={0,1,2,3,4,5,6}; 

		while(length > 0) {
			System.out.println(fun[0]);
			System.arraycopy(fun,1,fun,0,--length);
		}
		System.out.println(fun[0]+","+fun[1]+","+fun[2]+","+fun[3]+","+fun[4]+","+fun[5]+","+fun[6]);
	}

}
