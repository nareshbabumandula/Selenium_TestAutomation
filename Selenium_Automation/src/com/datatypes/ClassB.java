package com.datatypes;

public class ClassB extends ClassA {
	int a=50;
	int b= 60;
	
		void addition() {
			int c=a+b;
			System.out.println("addition a and b is:"+c);
			
	
	}
		int a2=10;
		int b2 =55;
		void substraction() {
			int c=b-a;
				
			System.out.println("substraction of a and b is :" +c);  
			
		}
		
		
	public static void main(String[] args) {

			ClassB H= new ClassB();
			H.addition();
			H=(ClassB)new ClassA();
			H.substraction(); 
			
		
		
	
	
	

	}

}
