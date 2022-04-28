package com.arrays.examples;

public class Arrays_Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double[] temp= new double[15];
		temp[0]=23.5;
		temp[1]=10.3;
		temp[2]=11.5;
		temp[4]=32.1;
		
		/*
		 * System.out.println(temp[0]); System.out.println(temp[4]);
		 * System.out.println(temp[1]); System.out.println(temp[3]);
		 * System.out.println(temp[2]); System.out.println(temp[5]);
		 */
		
		
		//System.out.println(temp.length);
		
		int l=temp.length;
		
		for(int i=0;i<l;i++) {
			
			System.out.println(temp[i]);
		}
		

	}

}
