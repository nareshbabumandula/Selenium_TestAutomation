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
		System.out.println(str.indexOf('h'));
		System.out.println(str.endsWith("world"));
		System.out.println(str.lastIndexOf('l'));
		System.out.println(str.startsWith("hello"));
		System.out.println(str.isEmpty());
		System.out.println(str.isBlank());
		System.out.println(str.replace("hello", "hi"));
		System.out.println(str.substring(0, 4));
		String st = "View invoices edit or make payments add or change subscriptions";
		String asText[] = st.split(" ");
		System.out.println(asText[0]);
		System.out.println(asText[1]);
		System.out.println(asText[2]);
		System.out.println(st.join(">", asText));
		
		for(String element : asText) {
			System.out.println(element);
		}
			
	}

}
