package com.janbask.methodsExample;

public class Addition {
	
	//passing parameters or arguments
	public void add(int a, int b,int c) {
		
		int res=a+b+c;
		
		System.out.println("Addition of "+a+" and "+b+" and "+ c+" is "+res);
		
		
		
		
	}

	public static void main(String[] args) {
		
		Addition a = new Addition();
	     a.add(30, 10,6);
		a.add(50, 20,5);
		a.add(40, 30,5);
		a.add(0, 100,10);
		

	}

}
