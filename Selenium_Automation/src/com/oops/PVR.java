package com.oops;

public class PVR extends Theater{

	void carParking() {
		System.out.println("Car Parking facility is available");
	}
	
	public static void main(String[] args) {
		PVR p = new PVR();
		p.ticketBooking();
		p.carParking();

	}


	void ticketBooking() {
		System.out.println("Ticket booking facility is available..!");
	}

}
