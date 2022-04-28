package com.arrays.examples;

public class Arrays_Ex {

	public static void main(String[] args) {
		
		String Students[]= new String[10];
		
		Students[3]="Mark";
		Students[2]="Steve";
		Students[5]="Kane";
		Students[1]="Joe";
		Students[4]="Rim";
		Students[0]="Peter";
		Students[4]="Marlon";
		Students[0]="Dean";
		
		/*
		 * System.out.println(Students[0]); System.out.println(Students[1]);
		 * System.out.println(Students[2]); System.out.println(Students[3]);
		 * System.out.println(Students[4]); System.out.println(Students[5]);
		 */
		
		
		
	int l=Students.length;
		
		
		for(int i=0;i<l;i++) {
			
			System.out.println(Students[i]);
		}
		
		
		
		
		
		
	}

}
