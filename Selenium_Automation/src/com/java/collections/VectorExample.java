package com.java.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class VectorExample {

	// Java collection is framework or an architecture with which we can store and manipulate the group of objects
	public static void main(String[] args) {
		
		List<String> list = new Vector<String>(); // Upcasting
		Vector<String> vec = new Vector<String>();
		
		vec.add("padma");
		vec.add("vikas");
		vec.add("saran");
		vec.add("jaipal");
		vec.add("priyaveena");
		vec.add("himaja");
		vec.add("renuka");
		vec.add("priyanka");
		vec.add("padma");
		vec.add("prashanth");
		vec.add(null);
			
		System.out.println("First element is : " + vec.firstElement());
		System.out.println("Last element is : " + vec.lastElement());
		System.out.println("Capacity is : " + vec.capacity());
		
		System.out.println(vec.get(0));
		System.out.println(vec.get(1));
		vec.remove(1);
		System.out.println(vec.get(1));
		System.out.println(vec.contains("himaja"));
		System.out.println(vec.isEmpty());
		System.out.println(vec.size());
		System.out.println(vec.remove("jaipal"));
		
		for (int i = 0; i < vec.size(); i++) {
			System.out.println(vec.get(i));
		}
				
		// lamda expression on collection
		System.out.println("Lamda on collection");
		vec.forEach((n)->System.out.println(n));
		
		ArrayList<String> vec1 = new ArrayList<String>();
		vec1.add("vamshi");
		vec1.add("shiva");
		vec1.add("rajesh");
		vec1.add("neelima");
		
		System.out.println("Adding two collections");
		vec.addAll(vec1); // Add two collections
		vec.forEach((value)->System.out.println(value));
		
		ArrayList vec2 = new ArrayList();
		vec2.add("naresh");
		vec2.add(true);
		vec2.add(1234);
		vec2.forEach((value)->System.out.println(value));
		
		
		
					
	}

}
