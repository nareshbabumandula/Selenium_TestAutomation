package com.access.modifiers.outside;

import com.access.modifiers.ProtectedTest;

public class ProtectedOutsidePackageTest extends ProtectedTest{
	
	public static void main(String[] args) {
		System.out.println("Protected outside package..!");
		//ProtectedTest pt = new ProtectedTest();
		//System.out.println(pt.a);
		//System.out.println(pt.b);
		//pt.addition();
		ProtectedOutsidePackageTest pop = new ProtectedOutsidePackageTest();
		System.out.println(pop.a);
		System.out.println(pop.b);
		pop.addition();
		
	}

}
