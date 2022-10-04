package com.java.basics;

public class MethodsTest {
	
	// user defined methods
	// Method without arguments and without return type
	void m1() {
		System.out.println("Executing method m1..!");
	}
	
	// Method without arguments and with return type integer
	int m2() {
		int a=10;
		int b=20;
		int c=a+b;
		return c;
	}
	
	void m3() {
		int x = m2(); // Method call
		System.out.println("Output generated from method m2 is : " +x);
	}
	
	// Method with arguments and with return type double
	double m4(double a, double b) {
		double c=a+b;
		return c;
	}

	 // Return an array from method
	static int[] m5() {
		int[] marks = {55,75,80,90,60};
		return marks;
	}
		
	public static void main(String[] args) {
		MethodsTest mt = new MethodsTest();
		int x=100; // plain java expression
		int y=200;
		int z=300;
		mt.m2(); // Method call
		mt.m3(); 
		mt.m1(); 
		double res = mt.m4(124.245,346.476);
		System.out.println(res);
		int[] output = m5();
		System.out.println(output[0]);
		System.out.println(output[1]);
		System.out.println(output[2]);
		System.out.println(output[3]);
		System.out.println(output[4]);
		System.out.println(output[5]); // ArrayIndexOutofBoundsException
		
		
	}

}
