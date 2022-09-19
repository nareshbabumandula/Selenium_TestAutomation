package com.oops;

public class PVR extends Theater{

	public static void main(String[] args) {
		PVR p = new PVR();
		p.ticketBooking();
		p.parking();

	}


	void ticketBooking() {
		System.out.println("Ticket booking facility is available..!");
	}


	void parking() {
		System.out.println("Parking facility is available at PVR to park 100 cars and 300 bikes");
	}

}
