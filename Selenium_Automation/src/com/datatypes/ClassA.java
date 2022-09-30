package com.datatypes;

public class ClassA {
	int a=10;
	int b=20;
	void addition() {
		int c=a+b;
		System.out.println("addition a and b is:"+c);
	}

	public static void main(String[] args) {
		ClassA G=new ClassA();
		G.addition();
		System.out.println(G.a);
		System.out.println(G.b);

	}

}
