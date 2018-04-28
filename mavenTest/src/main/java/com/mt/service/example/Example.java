package com.mt.service.example;

import java.util.Arrays;

public class Example {
	String str = "good";
	char[] ch = {'a','b','c'};
	public static void main(String[] args) {
		Example ex = new Example();
        ex.change(ex.str,ex.ch);
        System.out.print(ex.str+" and ");
        System.out.print(ex.ch);
        String separator = ",";
        Arrays.asList( "a", "b", "d" ).forEach( e -> System.out.println( e + separator ) );
        Arrays.asList( "a", "b", "d" ).sort(( e1, e2 ) -> {
            int result = e1.compareTo( e2 );
            return result;
        });
	}
	public void change(String str,char[] ch){
        str = "test ok";
        ch[0] = 'g';
    }
	
}
