package com.access.modifiers.outside;

import com.access.modifiers.PublicTest;

public class PublicOutsidePackageTest {
	
	public static void main(String[] args) {
		System.out.println("Public access modifier outside the package..!");
		PublicTest pt = new PublicTest();
		System.out.println(pt.a);
		System.out.println(pt.b);
		pt.addition();
	}

}
