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
		
		//Array - A group of elements of same type can be stored
		// We must [] to declare an array
		// The values in an array are ordered and can be accessed based on its index (starts from 0)
		String names[] = {"sai","akhil","raju","himaja","saran","jaipal","vikas"};
		System.out.println(names[0]);
		System.out.println(names[1]);
		System.out.println(names[6]);
		System.out.println(names.length);
		
		// One dimensional array declaration
		int score[];
		int[] rating;
		
		// Initialize an array
		score = new int[3]; // allocating memory to array
		score[0]=90; // store values
		score[1]=60;
		score[2]=50;
		
		System.out.println(score[0]);
		System.out.println(score[1]);
		System.out.println(score[2]);
		
		int prices[] = new int[5]; // Initialize and allocate memory
		
		int cost[] = new int[] {10,50,70,80,40}; // Array literal - If we know the size and variables of an array
		int rate[] = {50, 90, 70, 30, 40, 20}; // There is no need of new int[] in the latest versions of java
	
		// To access each element/value from an array
		for (int j = 0; j < rate.length; j++) {
			System.out.println("Value is : "+ rate[j]);
		}
		
		// foreach loop
		System.out.println("For each loop starts");
		for (int value : rate) {
			System.out.println("Value is : "+ value);
		}
		
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
	    
	    DataTypes dt = new DataTypes();
	    System.out.println(dt.hashCode());
	    DataTypes dt1 = new DataTypes();
	    System.out.println(dt1.hashCode());
	}

}
