package com.access.modifiers;

public class PrivateTest {
	
	//private data members
	private int a=10;
	private int b=20;
	
	//private method
	private void addition() {
		int c=a+b;
		System.out.println("Addition of a and b is : "+c);
	}
	
	// Constructor
	private PrivateTest() {
		System.out.println("This is an protected constructor");
	}
	
	// Parameterized Constructor
	private PrivateTest(int a, int b){
		System.out.println("This is an parameterized protected constructor");
	}

	public static void main(String[] args) {
		PrivateTest pt = new PrivateTest();
		System.out.println(pt.a);
		System.out.println(pt.b);
		pt.addition();
	}

}
