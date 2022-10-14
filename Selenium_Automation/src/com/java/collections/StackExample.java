package com.java.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;


public class StackExample {

	// Java collection is framework or an architecture with which we can store and manipulate the group of objects
	public static void main(String[] args) {
		
		List<String> list = new Stack<String>(); // Upcasting
		// Stack follows L-I-F-O data structure
		Stack<String> stack = new Stack<String>();
		
		stack.add("padma");
		stack.add("vikas");
		stack.add("saran");
		stack.add("jaipal");
		stack.add("priyaveena");
		stack.add("himaja");
		stack.add("renuka");
		stack.add("priyanka");
		stack.add("padma");
		stack.add(null);
		stack.add("prashanth");
		
		stack.pop();
		System.out.println("Last element after pop : " + stack.lastElement());
			
		System.out.println("First element is : " + stack.firstElement());
		System.out.println("Last element is : " + stack.lastElement());
		System.out.println("Capacity is : " + stack.capacity());
		
		System.out.println(stack.get(0));
		System.out.println(stack.get(1));
		stack.remove(1);
		System.out.println(stack.get(1));
		System.out.println(stack.contains("himaja"));
		System.out.println(stack.isEmpty());
		System.out.println(stack.size());
		System.out.println(stack.remove("jaipal"));
		
		for (int i = 0; i < stack.size(); i++) {
			System.out.println(stack.get(i));
		}
				
		// lamda expression on collection
		System.out.println("Lamda on collection");
		stack.forEach((n)->System.out.println(n));
		
		ArrayList<String> stack1 = new ArrayList<String>();
		stack1.add("vamshi");
		stack1.add("shiva");
		stack1.add("rajesh");
		stack1.add("neelima");
		
		System.out.println("Adding two collections");
		stack.addAll(stack1); // Add two collections
		stack.forEach((value)->System.out.println(value));
		
		ArrayList stack2 = new ArrayList();
		stack2.add("naresh");
		stack2.add(true);
		stack2.add(1234);
		stack2.forEach((value)->System.out.println(value));
		
		
		
					
	}

}
