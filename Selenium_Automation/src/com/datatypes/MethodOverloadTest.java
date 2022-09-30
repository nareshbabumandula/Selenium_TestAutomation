package com.datatypes;

public class MethodOverloadTest {
	int a=10;
	 int b=20;
	 void addition() {
	int c=a+b;
	System.out.println("addition of  a and b : "+c);
	
		 
	 }
	 void addition(int a ,int b) {
		 int c=a+b;
		 System.out.println("addition ofinteger  a and b : "+c);
	 }
	 
		  void addition(int a,int b, int c) {
			 int d=a+b+c;
			 System.out.println("addition of  a,b and c is :"+d);
		  }
			 
	 

	public static void main(String[] args) {
		
	MethodOverloadTest mt=new MethodOverloadTest();
	mt.addition();
	System.out.println(mt.a);
	System.out.println(mt.b);
	mt.addition();
	mt.addition(30, 50);
	mt.addition(20, 040, 060);
	
	
	
	
	
	

	}

}
