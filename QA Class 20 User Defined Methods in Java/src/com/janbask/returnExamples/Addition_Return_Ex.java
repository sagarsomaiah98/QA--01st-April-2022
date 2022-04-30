package com.janbask.returnExamples;

public class Addition_Return_Ex {
	
	
	public double add() {
		
		
		int k=80;
		int l=60;
		
		double j=k+l;
		
		//System.out.println("Addition of two numbers is "+j);
		
		return j+20-10+k-l;
	}

	public static void main(String[] args) {
		
		Addition_Return_Ex a= new Addition_Return_Ex();
		a.add();
		
		
		double value=a.add();
		
		System.out.println(" value is "+value);
		
		
	}

}
