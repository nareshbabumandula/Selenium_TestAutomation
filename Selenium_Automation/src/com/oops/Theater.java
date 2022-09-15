package com.oops;

public abstract class Theater {
	
	// Non abstract method or concrete method or method with body
	void onlineBooking() {
		System.out.println("Online booking facilty is optional");
	}
	
	// Abstract method also called as bodyless method or method without body/implementation
	abstract void ticketBooking();

	
	public static void main(String[] args) {
		
		//Theater th = new Theater(); // We cannot create an objRef for an abstract class
		
	}

}
