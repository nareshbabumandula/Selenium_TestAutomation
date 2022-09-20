package com.access.modifiers;

public class PackageTest {
	
	//package data members
	int a=10;
	int b=20;
	
	//package method
	void addition() {
		int c=a+b;
		System.out.println("Addition of a and b is : "+c);
	}
	
	// Constructor
	PackageTest() {
		System.out.println("This is an package constructor");
	}
	
	// Parameterized Constructor
	PackageTest(int a, int b){
		System.out.println("This is an parameterized package constructor");
	}

	public static void main(String[] args) {
		PackageTest pt = new PackageTest();
		System.out.println(pt.a);
		System.out.println(pt.b);
		pt.addition();
	}

}
