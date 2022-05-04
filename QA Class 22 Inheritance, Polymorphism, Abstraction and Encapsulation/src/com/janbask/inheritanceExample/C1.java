package com.janbask.inheritanceExample;

public class C1  extends P1 {
	
	String dept="Management";
	
	public void employee() {
		
		
		System.out.println("Calling employee method");
	}

	public static void main(String[] args) {
		
		
		C1 c= new C1();
		System.out.println(c.dept);
		c.employee();
		
		
		//parent methods and variables 
		
		System.out.println(c.age);
		System.out.println(c.name);
		c.method1();
		c.car();

	}

}
