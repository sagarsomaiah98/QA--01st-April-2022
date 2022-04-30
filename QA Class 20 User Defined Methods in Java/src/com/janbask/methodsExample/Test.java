package com.janbask.methodsExample;

public class Test {
	
	
	public void marks(int mark)
	
	{
		
		
		System.out.println("Marks is "+mark);
	}

	public static void main(String[] args) {
		
		
		Test t= new Test();
		t.marks(200);
		t.marks(250);
		t.marks(10);
		t.marks(80);

	}

}
