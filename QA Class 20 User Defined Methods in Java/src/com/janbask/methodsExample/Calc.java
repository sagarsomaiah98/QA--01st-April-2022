package com.janbask.methodsExample;

public class Calc {
	
	//Methods 
	
	// AccessModifiers returntype methodname()
	
	public void   Addition()
		
	{
		// block of addition code	
		
		  int a=10; int b=20;
		  
		  int c=a+b;
		  
		  System.out.println("Addition of two numbers "+a+" and "+b+" is "+c);
		 	
	}
	   
	   //Methods 
	  public void   Subtraction(){
		//block of subtraction code	
		
		  int k=50; int l=30;
		  
		  int m=k-l;
		  
		  System.out.println("Subtraction of two numbers "+k+" and "+l+" is "+m);
		 
		
	}
	

	public static void main(String[] args) {
		
	System.out.println("Main block");
	
	//Objects- create a object
	//classname object = new classname
		Calc c=new Calc();
	    c.Addition();
	    c.Addition();
	    c.Addition();
	    c.Subtraction();
	    c.Subtraction();
	   

	}

}
