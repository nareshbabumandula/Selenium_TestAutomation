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
		
		// Wrapper classes exists for all the 8 primitive data types e.g. Byte, Integer, Short, Double, Boolean
		// Character, Float, Long etc
		
		short s1 = 28654;
		//Autoboxing: Converting primitive data type into object type
		Short shortObj=s1;
		System.out.println("Min value for short is : " + shortObj.MIN_VALUE);
		System.out.println("Max value for short is : " + shortObj.MAX_VALUE);
		
		//Unboxing: Converting object type to its primitive data type
		short s2 = shortObj;
		System.out.println("Short value is : " + s2);
					
		// Casting : Narrowing and Widening
		byte b1=127; 
		int i1=b1; // implicit casting (widening)
		System.out.println(b1 + " " + i1);
		
		short s3=3271;
	    byte b3 =(byte)s3; // explicit casting or narrowing
	    System.out.println(s3 + " " + b3);
	  
	}

}
