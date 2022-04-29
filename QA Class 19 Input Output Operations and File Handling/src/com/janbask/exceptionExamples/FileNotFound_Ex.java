package com.janbask.exceptionExamples;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileNotFound_Ex {

	public static void main(String[] args) throws FileNotFoundException  {
	
		
		FileInputStream fis = new FileInputStream("C:\\Users\\somai\\OneDrive\\Deskto\\wsdl-report.html");
		
		System.out.println("file processing");
		System.out.println("Start program");
		System.out.println("End of the program");

	}

}
