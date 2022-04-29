package com.janbask.trycatchExample;

public class Try_Catch_Ex {

	public static void main(String[] args) {
		
		
		try 
		{
			int a[] = new int[5];
	        a[6] = 9; 	
			
			
		}
		catch(Exception e1)
		{
		
	    e1.printStackTrace();	
			
	//	System.out.println("Cannot store value at index 6 because length is 5");	
			
		}
		
		System.out.println("continue with the program");
		
		int a=10;
		int b=20;
		System.out.println("Addition of two numbers is "+ (a+b));

	}

}
