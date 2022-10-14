package com.java.programs;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SortStringArrayExample {

	public static void main(String[] args) {
		String str[] = {"naresh", "saran", "anil", "vikas", "padma"};
		List<String> res = Arrays.asList(str);
		Set<String> s3 = new TreeSet<>();
		s3.addAll(res);
		
		Iterator<String> iter = s3.iterator();
		
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}

	}

}
