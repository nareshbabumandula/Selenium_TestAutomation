package com.oops;

public class MethodOverloadTest {
	
	// a and b are variables
	int a=10;
	int b=20;
    String str = "hello";
	
	/**
	 * @author naresh
	 * @Desc This is method is used for adding two integer numbers
	 * @ReturnType nothing
	 * @DateCreated 13-Sep-2022
	 * @DateModified 
	 */
	void addition() {
		// code or functionality will be written inside a method is called as implementation or logic
		int c=a+b;
		System.out.println("Addition of a and b is : " +c);
	}
			
	void addition(int a, int b) {
		int c=a+b;
		System.out.println("Addition of integer a and b is : " +c);
	}
	
	void addition(int a, int b, int c) {
		int d=a+b+c;
		System.out.println("Addition of a, b and c is : " +d);
	}
	
	void addition(double a, double b) {
		double c=a+b;
		System.out.println("Addition of double a and b is : " +c);
	}

	public static void main(String[] args) {
		MethodOverloadTest mot = new MethodOverloadTest();
		mot.addition();
		mot.addition(30, 40);
		mot.addition(10, 20, 30);
		mot.addition(122.3453, 366.457);
	}

}
