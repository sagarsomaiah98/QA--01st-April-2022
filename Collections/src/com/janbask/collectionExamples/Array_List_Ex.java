package com.janbask.collectionExamples;

import java.util.ArrayList;
import java.util.List;

public class Array_List_Ex {

	public static void main(String[] args) {
		
		
		List<String> stud= new ArrayList<String>();
		
		stud.add("Joe");
		stud.add("Henry");
		stud.add("James");
		stud.add("bob");
		
		/*
		 * System.out.println(stud.size()); System.out.println(stud.get(0));
		 * System.out.println(stud.get(1)); System.out.println(stud.get(2));
		 * System.out.println(stud.get(3));
		 */
		//System.out.println(stud.get(4));
		
		stud.add("Kane");
		stud.add("Kevin");
		System.out.println("*********************");
		
		System.out.println(stud.size());
		
		
		for(int i=0;i<stud.size();i++) {
			
			System.out.println(stud.get(i));
		}
		

	}

}
