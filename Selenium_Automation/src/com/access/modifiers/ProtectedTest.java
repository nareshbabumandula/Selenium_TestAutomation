package com.access.modifiers;

public class ProtectedTest {
	
	//protected data members
	protected int a=10;
	protected int b=20;
	
	//protected method
	protected void addition() {
		int c=a+b;
		System.out.println("Addition of a and b is : "+c);
	}
	
	// Constructor
	protected ProtectedTest() {
		System.out.println("This is a protected constructor");
	}

	public static void main(String[] args) {
		ProtectedTest pt = new ProtectedTest();
		System.out.println(pt.a);
		System.out.println(pt.b);
		pt.addition();
	}

}
