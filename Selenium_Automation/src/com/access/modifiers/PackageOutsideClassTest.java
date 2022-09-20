package com.access.modifiers;

public class PackageOutsideClassTest {
	
	public static void main(String[] args) {
		System.out.println("Package access modifers outside class..!");
		PackageTest pt = new PackageTest();
		System.out.println(pt.a);
		System.out.println(pt.b);
		pt.addition();
	}

}
