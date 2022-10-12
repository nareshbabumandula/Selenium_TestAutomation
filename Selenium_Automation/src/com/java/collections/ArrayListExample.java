package com.java.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	// Java collection is framework or an architecture with which we can store and manipulate the group of objects
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>(); // Upcasting
		ArrayList<String> alist = new ArrayList<String>();
		
		alist.add("padma");
		alist.add("vikas");
		alist.add("saran");
		alist.add("jaipal");
		alist.add("priyaveena");
		alist.add("himaja");
		alist.add("renuka");
		alist.add("priyanka");
		alist.add("padma");
		alist.add(null);
		
		System.out.println(alist.get(0));
		System.out.println(alist.get(1));
		alist.remove(1);
		System.out.println(alist.get(1));
		System.out.println(alist.contains("himaja"));
		System.out.println(alist.isEmpty());
		System.out.println(alist.size());
		System.out.println(alist.remove("jaipal"));
		
		for (int i = 0; i < alist.size(); i++) {
			System.out.println(alist.get(i));
		}
				
		// lamda expression on collection
		System.out.println("Lamda on collection");
		alist.forEach((n)->System.out.println(n));
		
		ArrayList<String> alist1 = new ArrayList<String>();
		alist1.add("vamshi");
		alist1.add("shiva");
		alist1.add("rajesh");
		alist1.add("neelima");
		
		System.out.println("Adding two collections");
		alist.addAll(alist1); // Add two collections
		alist.forEach((value)->System.out.println(value));
		
		ArrayList alist2 = new ArrayList();
		alist2.add("naresh");
		alist2.add(true);
		alist2.add(1234);
		alist2.forEach((value)->System.out.println(value));
		
		
		
					
	}

}
