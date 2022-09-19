package com.oops;

public abstract class Theater {
	
	// Abstraction - Showing only the functionality to the user by hiding the implementation
	//e.g. Fan, SMS, Calling, Driving
	
	// Non abstract method or concrete method or method with body
	void onlineBooking() {
		System.out.println("Online booking facilty is optional");
	}
	
	// Abstract method also called as bodyless method or method without body/implementation
	abstract void ticketBooking();
	abstract void parking();

	
	public static void main(String[] args) {
		
		//Theater th = new Theater(); // We cannot create an objRef for an abstract class
		
	}

}
