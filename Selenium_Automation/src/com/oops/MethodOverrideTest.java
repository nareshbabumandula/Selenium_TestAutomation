package com.oops;

public class MethodOverrideTest extends MethodOverloadTest{
	
	int a=100;
	int b=200;
	
	void addition() {
		int c=a+b;
		System.out.println("Addition of a and b in the current class is : " +c);
	}

	public static void main(String[] args) {
		// Classname objRefName = new Constructor();
		MethodOverrideTest mot = new MethodOverrideTest();
		mot.addition();
		System.out.println(mot.a);
		System.out.println(mot.b);

	}

}
