package com.janbask.staticKeyword;

public class Employee {
	
	
	
	//static method can be called without creating object
	
	//method 1
	public   void emp_info()
	{
		
		String name="John";
		int age= 50;
		
		System.out.println("Employee: "+name);
		System.out.println("Age: "+age);
		
	}
	//static method 2
	public static void emp_salary() {
		
		double basic= 4500.01;
		double HRA= 5698.01;
		double LTA= 2345.02;
		
		System.out.println("Employee salary is "+(basic+HRA+LTA));
	}

	public static void main(String[] args) {
		
		
		Employee e= new Employee();
		e.emp_info();//non static method
		
		
		emp_salary();// static method

	}

}
