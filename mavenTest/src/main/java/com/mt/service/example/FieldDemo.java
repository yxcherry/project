package com.mt.service.example;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import org.apache.commons.lang3.reflect.FieldUtils;

public class FieldDemo {
	public static final int a =1;  
    public int b;  
    private String c;  
    protected String d; 
    
    public FieldDemo(int b,String c,String d) {  
        this.b = b;  
        this.c = c;  
        this.d = d; 
    } 
    public static void main(String[] args) throws Exception {
    	FieldDemo demo = new FieldDemo(5, "ab", "cd");
//    	Field  dd = FieldDemo.class.getDeclaredField("c");
//    	System.out.println(dd.get(demo));
//    	
//    	Field field1 = FieldDemo.class.getDeclaredField("a");
//    	field1.setAccessible(true);
//    	System.out.println(field1.get(demo));
    	swapString(demo);
	}

    private static void swapString(FieldDemo pt1)
			throws IllegalArgumentException, IllegalAccessException {
		// get all fields
		Field[] fields = FieldUtils.getAllFields(pt1.getClass());
		for (Field field : fields) {
			// 我说的是String 类型的字段，当然要选择一下
			// if(field.getType().equals(String.class)) {
			// 字节码都是一份的，干什么用equals啊
			System.out.println(field.getName());
			System.out.println(Modifier.toString(field.getModifiers()));
			if (field.getType() == String.class) {
				String oldValue = (String) field.get(pt1);
				String newValue = oldValue.replace('b', 'a');
				// 改 对象的字段
				field.set(pt1, newValue);


			}
		}


		System.out.println(pt1.c);
		System.out.println(pt1.d);
		Class cl =  FieldDemo.class;
		System.out.println(cl.getName());
	}
}
