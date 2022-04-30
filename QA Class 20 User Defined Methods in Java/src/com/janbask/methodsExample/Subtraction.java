package com.janbask.methodsExample;

public class Subtraction {
	
	 public void   Sub(int k, int l){
			//block of subtraction code	
			
			  
			  
			  int m=k-l;
			  
			  System.out.println("Subtraction of two numbers "+k+" and "+l+" is "+m);
			 
			
		}

	public static void main(String[] args) {
		
		Subtraction s= new Subtraction();
		s.Sub(10,5);
		s.Sub(50,20);

		s.Sub(80,60);


	}

}
