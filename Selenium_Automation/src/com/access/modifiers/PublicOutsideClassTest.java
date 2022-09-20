package com.access.modifiers;

public class PublicOutsideClassTest {
	
	public static void main(String[] args) {
		System.out.println("Public access modifier outside the class..!");
		PublicTest pt = new PublicTest();
		System.out.println(pt.a);
		System.out.println(pt.b);
		pt.addition();
	}

}
