package com.janbask.trycatchExample;

public class Calc {
	
	//Methods
	
	//Access Modifiers Returntype methodname
	public void Addition() 
	{
		
		int a=20;
		int b=30;
		int res=a+b;

		System.out.println("Addition of "+a+"  and "+b +" is "+res);
		
	}
	
	public void Subraction()
	    {
		
		 int k=50; 
		  int l=15; 
		  int res1=k-l;
		  
		  System.out.println("Subraction of "+k+"  and "+l +" is "+res1);
		
		
	}
	
	

	public static void main(String[] args) {

     Calc c= new Calc();
     c.Addition();
     c.Subraction();



 
 

	}

}
