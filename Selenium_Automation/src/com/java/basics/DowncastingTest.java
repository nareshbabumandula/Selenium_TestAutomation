package com.java.basics;

public class DowncastingTest {

	public static void main(String[] args) {
		Parent p = new Child(); // Upcasting
		//Child c = (Child) new Parent(); // Compile time error
		Child c1 = (Child)p; // Downcasting
		c1.m1();
		c1.m2();
		c1.m3();
		c1.m4();
	}

}
