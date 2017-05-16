package com.dqdl.demo.util;

public class SimpleLog {
	
	public static void error(Object target, String logContent) {		
		System.err.println(target.getClass().getName()+": "+logContent);
	}
	
	public static void info(Object target, String logContent) {		
		System.out.println(target.getClass().getName()+": "+logContent);
	}

}
