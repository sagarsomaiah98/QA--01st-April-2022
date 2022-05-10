package com.janbask.saucetests;

public class Run {

	public static void main(String[] args) throws InterruptedException {
		
		
		LoginTest lt= new LoginTest();
		lt.login("standar_user", "secret_sauce");
		
	
		
		Place_Order p = new Place_Order();
		p.placeOrder();
		
		LogOut_Test lo= new LogOut_Test();
		lo.logout();

	}

}
