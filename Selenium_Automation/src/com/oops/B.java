package com.oops;

public class B extends A{
	
	int a=100;
	int b=200;
    int age;
		
	void subtraction() {
		int c=b-a;
		System.out.println("Subtraction of a and b is : " +c);
	}
	
	void addition() {
		int c=a+b;
		System.out.println("Addition of a and b is : "+c);
	}

	public static void main(String[] args) {
		/*
		 * B b = new B(); 
		 * b.subtraction(); 
		 * System.out.println(b.a);
		 * System.out.println(b.b);
		 */
	
		//Parent p = (Parent) new Child();
		A a1 = (A) new B();
		A a2 = (A) new B();
		a1.addition();
		a2.addition();
		
	
		//Parent p = new Child(); - Upcasting (Generalization/Widening) - Converting sub type to its super type
		// We do upcasting only when we need to develop a code that works with parent/super
		A a = new B();
		a.name="naresh";
					
		// Downcasting (Specialization/Narrowing)
		// Child c = new Parent --> Unresolved compilation erro
		// Downcast explicitly using casting operator ()
		// Syntax: Child c = (Child)p;
		B b = (B) a; // We do down casting only when we need to develop a code that works with child/dervied/sub class
		b.age=37;
		System.out.println(a.name);
		System.out.println(b.age);
		b.addition();
			
		
	}

}
