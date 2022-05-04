package com.janbask.interfaceExample;

public class HSBC_Bank  implements RBI_Central {
	
	

	public static void main(String[] args) {
		HSBC_Bank b= new HSBC_Bank();
		b.saving();
		b.insurance();
		b.creditcard();
		

	}

	@Override
	public void saving() {
		System.out.println("calling hsbc saving account");
		
	}

	@Override
	public void creditcard() {
		// TODO Auto-generated method stub
		System.out.println("Calling hsbc credit card");
		
	}

	@Override
	public void insurance() {
		// TODO Auto-generated method stub
		System.out.println("Calling hsbc insurace ");
		
	}

	@Override
	public void kyc() {
		// TODO Auto-generated method stub
		
	}

}
