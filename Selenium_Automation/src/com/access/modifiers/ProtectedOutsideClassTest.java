package com.access.modifiers;

public class ProtectedOutsideClassTest {
		
	public static void main(String[] args) {
		System.out.println("Protected outside class..!");
		ProtectedTest pt = new ProtectedTest();
		System.out.println(pt.a);
		System.out.println(pt.b);
		pt.addition();
	}

}
