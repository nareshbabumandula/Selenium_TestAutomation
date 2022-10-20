package com.exception.handling;

public class TestCustomException {

	static void castVote(int age) throws InvalidAgeException {
		if (age>=18) {
			System.out.println("Person is allowed to cast vote");
		} else {
			System.out.println("Age is not valid to cast vote");
			throw new InvalidAgeException("Age is not valid to cast vote");
		}
	}
		
	public static void main(String[] args) throws InvalidAgeException {
		castVote(13); // static method call
	}

}
