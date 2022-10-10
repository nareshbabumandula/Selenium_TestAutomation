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
			
	}

}
