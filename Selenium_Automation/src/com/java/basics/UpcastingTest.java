package com.java.basics;

public class UpcastingTest {

	public static void main(String[] args) {
		//Upcasting: It's a process of converting/casting child/sub type object to a parent/super type 
		//object	
		// Upcasting
		Parent p = new Child();
		p.m1(); // Calls child class method
		p.m2();
		System.out.println(p.a);
		
		// Upcasting : Generalization 
		Parent p1 = (Parent) new Child();
		Parent p2 = (Parent) new Child();
		p1.m1();
		p2.m1();
	}

}
