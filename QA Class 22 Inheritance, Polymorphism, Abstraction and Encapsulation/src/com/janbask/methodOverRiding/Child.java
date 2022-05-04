package com.janbask.methodOverRiding;
public class Child extends Parent {
	
	
	//method overriding
	public void method1() {
		
		System.out.println("modified parent method1 in child class");
	}
	
	
	
	public void method3() {
		System.out.println("Child  method 3");
		
	}
	
	public void method4() {
		
		System.out.println("Child method 4");
	}
	
	
	
	

	public static void main(String[] args) {
		
		Child c= new Child();
		
		c.method1();
		c.method2();
		c.method3();
		c.method4();
	

	}

}
