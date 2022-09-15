package com.oops;

public interface RBI {
	
	void accountType();
	void loans();
	void minDeposit();
	void maxDeposit();
	
	static void minWithDrawl() {
		System.out.println("Minimum withdrawl amount is 100 rupees");
	}
	
	default void maxWithDrawl() {
		System.out.println("Maximum withdrawl amount is 5 lakh rupees");
	}
	
	public static void main(String[] args) {
		
		//RBI r = new RBI();
		minWithDrawl();

	}

}
