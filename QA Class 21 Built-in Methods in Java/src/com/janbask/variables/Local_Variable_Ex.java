package com.janbask.variables;

public class Local_Variable_Ex {
	
	
	
	public void employee() {
		//local variables- accesible within the method
		int age=23;
		String dept=" Manufacturing";
		
		System.out.println("Age: "+age+"|  Department: "+dept);
		
		//System.out.println(salary);
		
	}
	
	public void company() {
		int age=50;
		String dept=" Production";
		
		
		System.out.println("Age: "+age+"|  Department: "+dept);
		
		
		
	}
	
	public void bank() {
		int age=40;
		double salary=2345/78;
		
		System.out.println("Age"+age);
		
		
	}

	public static void main(String[] args) {
		
		Local_Variable_Ex l = new Local_Variable_Ex();
        l.company();
		

	}

}
