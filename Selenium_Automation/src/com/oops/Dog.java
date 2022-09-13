package com.oops;

public class Dog extends Pet{

	String breed = "german shepard";
	
	public void getBreed() {
		System.out.println("Dog breed is : " + breed);
	}
	
	public static void main(String[] args) {
		// Classname refName = new Constructor();
		Dog d = new Dog();
		System.out.println(d.breed);
		d.getBreed();
		System.out.println(d.petType);
		System.out.println(d.maxage);
	    d.eat();
	    System.out.println(d.age);
	
	}

}
