package com.janbask.methodsExample;

public class Student_Parameters {
	
	
	int marks=90;
	
	
	public void Rank(int actualmark) {
		if(actualmark>marks)
			System.out.println("EXCELLENT");
		else
			System.out.println(" GOOD");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Student_Parameters s= new Student_Parameters();
		s.Rank(60);
		s.Rank(100);
		s.Rank(30);
		s.Rank(99);

	}

}
