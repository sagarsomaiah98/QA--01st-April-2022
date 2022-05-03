package com.janbask.variables;

public class Global_Variable_Ex {
	
	int age=30;
	
	String name="Bob";
	
	
	public void method1() {
		
		System.out.println(age);
		System.out.println(name);
		
	}
	
	
	public void method2() 
	{
		
		System.out.println(age);
		System.out.println(name);
		
	}

	public static void main(String[] args) {
		Global_Variable_Ex g= new Global_Variable_Ex();
		
		g.method1();
		g.method2();
		

	}

}
