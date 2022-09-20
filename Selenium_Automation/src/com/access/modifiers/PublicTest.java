package com.access.modifiers;

public class PublicTest {
	
	//public data members
	public int a=10;
	public int b=20;
	
	//public method
	public void addition() {
		int c=a+b;
		System.out.println("Addition of a and b is : "+c);
	}
	
	// Constructor
	public PublicTest() {
		System.out.println("This is an public constructor");
	}
	
	// Parameterized Constructor
	public PublicTest(int a, int b){
		System.out.println("This is an parameterized public constructor");
	}

	public static void main(String[] args) {
		PublicTest pt = new PublicTest();
		System.out.println(pt.a);
		System.out.println(pt.b);
		pt.addition();
	}

}
