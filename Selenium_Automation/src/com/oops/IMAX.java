package com.oops;

public class IMAX extends Theater{

	public static void main(String[] args) {
		IMAX im = new IMAX();
		im.parking();
		im.ticketBooking();

	}

	@Override
	void ticketBooking() {
		System.out.println("Ticket booking facility is available..!");
		
	}

	@Override
	void parking() {
		System.out.println("Parking facility is available at PVR to park 200 cars and 400 bikes");
	}

}
