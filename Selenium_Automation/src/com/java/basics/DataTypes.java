package com.java.basics;

public class DataTypes {

	// Java is a high level, statically type dynamic programming language
	public static void main(String[] args) {
		// 8 Primitive data types
		byte b=103;
		short s=23444;
		int i=134353;
		long l=4336456;
		float f = 12.5f;
		double d = 234.2352355;
		char c ='f';
		boolean bflag=true;
		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		System.out.println(c);
		System.out.println(bflag);
		
		// Non primitive data types
		String str = "hello";
		System.out.println(str);
		
		String marks[] = {"sai","akhil","raju","himaja","saran","jaipal","vikas"};
		System.out.println(marks[0]);
		System.out.println(marks[1]);
		System.out.println(marks.length);
		
		// Casting : Narrowing and Widening
		byte b1=125;
		int i1=b1; // implicit casting (widening) or up casting
		System.out.println(b1 + " " + i1);
		
	    short s1=3271;
	    byte b3 =(byte)s1; // explicit casting or narrowing or down casting
	    System.out.println(s1 + " " + b3);
	}

}
