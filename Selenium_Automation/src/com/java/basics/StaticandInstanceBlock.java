package com.java.basics;

public class StaticandInstanceBlock {
	
	static String str = "testuser";
			
	// static block
	static {
		System.out.println("Executing static block..!");
		m1();
	}
	
	// instance block
	{
		System.out.println("Executing instance block..!");
		m1();
	}
	
	static void m1() {
		System.out.println("Executing method m1..!");
	}
	
	// no argument constructor
	public StaticandInstanceBlock() {
		System.out.println("Executing no argument constructor..!");
	}
	
	// parameterized constructor
	public StaticandInstanceBlock(String str) {
		System.out.println("Executing parameterized constructor with parameter : " + str);
	}
	

	public static void main(String[] args) {
		StaticandInstanceBlock st1 = new StaticandInstanceBlock();
		StaticandInstanceBlock st2 = new StaticandInstanceBlock("Test");
		
		System.out.println(str);
		System.out.println(StaticandInstanceBlock.str);
		
	}

}
