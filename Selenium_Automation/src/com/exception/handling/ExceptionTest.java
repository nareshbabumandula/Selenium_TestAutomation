package com.exception.handling;

public class ExceptionTest {

	void m1(){
		
		try {
			int a=10;
			int b=10;
			int c=a/b;
			System.out.println("Addition of a and b is : "+ c);
			String[] names = {"padma", "jaipal", "vikas", "saran", "prashanth","priyanka"};
			System.out.println(names[0]);
			System.out.println(names[1]);
			System.out.println(names[2]);
			System.out.println(names[6]);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("m1 method failed due to : " +  e.getMessage());
		}
	}
	
	void m2() {
		System.out.println("Executing method m2..!");
	}

	public static void main(String[] args) {
		ExceptionTest et = new ExceptionTest();
		et.m1();
		et.m2();
	}

}
