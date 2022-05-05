package com.janbask.collectionExamples;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Set_Ex {

	public static void main(String[] args) {
		
		//doesnt store duplicate values
		
		Set<String> color = new HashSet<String>();
		color.add("Red");
		color.add("blue");
		color.add("black");
		color.add("Red");
		color.add("Blue");
		
		System.out.println(color.size());
		
		
		Iterator<String> it = color.iterator();
		
		/*
		 * System.out.println(it.next()); System.out.println(it.hasNext());
		 * System.out.println(it.next()); System.out.println(it.hasNext());
		 * System.out.println(it.next()); System.out.println(it.hasNext());
		 * System.out.println(it.next()); System.out.println(it.hasNext());
		 */
		
		
		while(it.hasNext()) {
			
			System.out.println(it.next());
		}
		
	}

}
