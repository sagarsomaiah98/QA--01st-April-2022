package com.janbask.inheritanceExample;

public class P1 {
	
	
	int age=23;
	String name="Henry";
	
	public void method1() {
		
		System.out.println("calling method 1");
	}
	
	public void car() {
		
		
		System.out.println("Calling car method");
	}

	public static void main(String[] args) {
	
		P1 p1 = new P1();
		
		System.out.println(p1.age);
		System.out.println(p1.name);
		p1.method1();
		p1.car();
		
		
		

	}

}
