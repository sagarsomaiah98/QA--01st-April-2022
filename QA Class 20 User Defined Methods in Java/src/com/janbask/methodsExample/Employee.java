package com.janbask.methodsExample;

public class Employee {
	
	
	//details of employee
	
	
	public void employee_info() 
	{
	int age=52;
	String name="John";
	char Dept='C';
	
	System.out.println("Employee "+name +" aged "+age+ " works for department "+Dept);
		
		
		
	}

	public static void main(String[] args) {
		Employee t=new Employee();
		t.employee_info();

	}

}
