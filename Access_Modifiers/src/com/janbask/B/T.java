package com.janbask.B;

import com.janbask.A.Protected_Example;

public class T  extends Protected_Example {

	public static void main(String[] args) {
		
		/*
		 * Protected_Example p = new Protected_Example(); p.method1();
		 * System.out.println(p.age); System.out.println(p.name);
		 */
		
		T t= new T();
		System.out.println(t.age);
		System.out.println(t.name);
		t.method1();
		

	}

}
