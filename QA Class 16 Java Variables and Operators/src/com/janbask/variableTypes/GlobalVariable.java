package com.janbask.variableTypes;

public class GlobalVariable {
	String name="Paul";
	
	int age=50;
	
	double salary=25.55;
	char grade='B';
	
	

	public static void main(String[] args) {
		
	//if we need to access anything outside the main then you should use the concept of object creation
		
		//Classname object= new Classname();
		
		
		GlobalVariable g= new GlobalVariable();
		
		System.out.println(g.name);
		System.out.println(g.age);
		
		System.out.println(g.salary);
		
		System.out.println(g.grade);
		

	}

}
