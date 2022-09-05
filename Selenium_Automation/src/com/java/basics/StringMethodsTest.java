package com.java.basics;

public class StringMethodsTest {

	public static void main(String[] args) {
		String str = "hello world";
		String sText = "HELLO";
		System.out.println(str.toUpperCase());
		System.out.println(str.length());
		System.out.println(sText.toLowerCase());
		System.out.println(str.equals("HELLO WORLD"));
		System.out.println(str.equalsIgnoreCase("HELLO WORLD"));
		System.out.println(str.charAt(0));
		System.out.println(str.charAt(4));
		System.out.println(str + " welcome to core java");
		System.out.println(str.concat(" ").concat("welcome to core java"));
		System.out.println(str.contains("world"));
	}

}
