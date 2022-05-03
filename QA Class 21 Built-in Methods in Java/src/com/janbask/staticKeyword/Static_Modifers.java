package com.janbask.staticKeyword;
public class Static_Modifers {
	
	//non static method
	public  void print() {
		
		
		System.out.println("printing the line");
	}
	
	//static method 
	public static void color() {
		
		System.out.println("calling color");
	}
	
   public static void emp_salary() {
		
		double basic= 4500.01;
		double HRA= 5698.01;
		double LTA= 2345.02;
		
		System.out.println("Employee salary is "+(basic+HRA+LTA));
	}
	
	public static void main(String[] args) {
		
	// calling static method	
		color();
		
		
	//calling non static method	
		Static_Modifers s = new Static_Modifers();
		
		s.print();
		
		
	}

}
