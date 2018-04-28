package com.mt.service.immutablemap;

import java.util.Map;

import com.google.common.collect.ImmutableMap;

public class ImmutableMapTest {

	public static void main(String[] args) {
		immutableMapTest();
	}
	private static void immutableMapTest() {  
        Integer key = 30;  
        System.out.println("key = " + key + "的提示语是：" + ConstantMap.INTEGER_STRING_MAP.get(key));  
        Map<Integer, String> ss = ImmutableMap.of(50,"关注广场舞");
        Integer key1= 50;
        System.out.println("key = " + key1 + "的提示语是：" + ss.get(key1)); 
    }  
}
