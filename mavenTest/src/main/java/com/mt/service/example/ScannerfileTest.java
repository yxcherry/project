package com.mt.service.example;

import java.io.File;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class ScannerfileTest {

	private static Scanner scanner;

	public static void main(String[] args) throws Exception{
		scanner = new Scanner(new File("C:\\Users\\Administrator\\Desktop\\dd.txt"));
		System.out.println("文件内容如下：");
		while(scanner.hasNext()) {
			System.out.println(scanner.nextLine());
		}
		ThreadLocalRandom localRandom = ThreadLocalRandom.current();
		System.out.println(localRandom.nextInt(3, 15));
	}
}
