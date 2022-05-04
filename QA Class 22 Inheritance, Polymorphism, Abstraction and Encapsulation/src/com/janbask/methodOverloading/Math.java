package com.janbask.methodOverloading;

public class Math {
	
	//same method name different arguments
	
	public void add(int a, int b) {//
		
		int c= a+b;
		
		System.out.println("Addition of two numbers "+a+"  and "+b+" is "+c);
	}
	
	public void add(int a, int b,int c) {
		
		System.out.println("Calling second method");
	}
	
	public void add(int a, String n) {
		
		System.out.println("Calling method 3");
	}

	public static void main(String[] args) {
		
		
		Math m= new Math();
		m.add(10, "joe");
		
		
		

	}

}
