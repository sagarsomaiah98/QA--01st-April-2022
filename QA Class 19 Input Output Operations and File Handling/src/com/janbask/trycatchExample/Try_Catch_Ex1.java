package com.janbask.trycatchExample;

import java.io.FileInputStream;

public class Try_Catch_Ex1 {

	public static void main(String[] args) {
		
		
		System.out.println("Beginning of file");
		
		int a=10;
		int b=20;
	
		try {
			FileInputStream s = new FileInputStream("c://documents/resume");
			
			
			System.out.println(a+b);
			
			System.out.println("FileFound processing");
			System.out.println("file processed");
			System.out.println("file is ready");
		}
		
		catch(Exception e) 
		{
			System.out.println("File not found for processing");
			e.printStackTrace();
			
		     System.out.println("End of the catch block");
		}
		
		System.out.println("file closure in progress");
		
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("Ending the file process");

	}

}
