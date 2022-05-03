package com.janbask.staticKeyword;
public class Static_Keyword {
	
 //Static keywords
	
	
	char grade='D';
	
	static int value= 20;  //Global variables
	
	static String name =" London"; // global variables
	
	public void method3() {
		
		System.out.println("method 3");
	}
	
	public static  void method1() {
		
		
		System.out.println(" method 1");
	}
	
	
	

	public static void main(String[] args) {
		
		Static_Keyword sk= new Static_Keyword();
		
		System.out.println(sk.grade);
		
		System.out.println(value);
		
		System.out.println(name);
		
		sk.method3();
		method1();
		
		
	}

}
