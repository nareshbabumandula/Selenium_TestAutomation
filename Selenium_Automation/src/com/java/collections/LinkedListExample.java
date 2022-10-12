package com.java.collections;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

	// Java collection is framework or an architecture with which we can store and manipulate the group of objects
	public static void main(String[] args) {
		
		List<String> list = new LinkedList<String>(); // Upcasting
		LinkedList<String> llist = new LinkedList<String>();
		
		llist.add("padma");
		llist.add("vikas");
		llist.add("saran");
		llist.add("jaipal");
		llist.add("priyaveena");
		llist.add("himaja");
		llist.add("renuka");
		llist.add("priyanka");
		llist.add("padma");
		llist.add(null);
				
		System.out.println(llist.get(0));
		System.out.println(llist.get(1));
		llist.remove(1);
		System.out.println(llist.get(1));
		System.out.println(llist.contains("himaja"));
		System.out.println(llist.isEmpty());
		System.out.println(llist.size());
		System.out.println(llist.remove("jaipal"));
		
		for (int i = 0; i < llist.size(); i++) {
			System.out.println(llist.get(i));
		}
				
		// lamda expression on collection
		System.out.println("Lamda on collection");
		llist.forEach((n)->System.out.println(n));
		
		LinkedList<String> llist1 = new LinkedList<String>();
		llist1.add("vamshi");
		llist1.add("shiva");
		llist1.add("rajesh");
		llist1.add("neelima");
		
		System.out.println("Adding two collections");
		llist.addAll(llist1); // Add two collections
		llist.forEach((value)->System.out.println(value));
					
	}

}
