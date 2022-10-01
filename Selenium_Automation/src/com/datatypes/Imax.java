package com.datatypes;

public class Imax  extends Theatre {



	
	void ticketbooking() {
		System.out.println("ticket booking facility available");
	}

	
	void carparking() {
		System.out.println("car parking limits 500 cars");
		
	}

	
	void bikeparking() {
		System.out.println("bikeparking  faciliy vailable limits 1000 bikes");
	}
		
		public static void main(String[] args) {
			Imax im =new Imax();
			
					im.bikeparking();
			im.carparking();
		}
			
		
		}
