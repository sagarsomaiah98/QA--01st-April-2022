package com.janbask.inheritanceExample;

public class Parent  {
	
	public int money=9000;
	public String Lastname="Henry";
	
	public void bike() {
		
		System.out.println(" parent owns a bike");
	}
	
	public void house() {
		
		System.out.println(" parent owns a house");
	}

	public static void main(String[] args) {
		
		Parent p=new Parent();
		
		System.out.println(p.money);
		System.out.println(p.Lastname);
		p.bike();
		p.house();
		
		//Parent cannot inherit the child properties
	//	p.car();
	//	p.Factory();
		

	}

}
