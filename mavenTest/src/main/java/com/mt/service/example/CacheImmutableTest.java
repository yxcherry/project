package com.mt.service.example;

public class CacheImmutableTest {

	public static void main(String[] args) {
		CacheImmutable c1 = CacheImmutable.valueOf("hello");
		CacheImmutable c2 = CacheImmutable.valueOf("hello");
		System.out.println(c1=c2);
	}

}
