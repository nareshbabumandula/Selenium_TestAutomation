package com.selenium.scripts;

public class Demo {

	public static void main(String[] args) {
		String foo = "abcdefz";
		String bar = "";

		for (char c : foo.toCharArray()) {
		   bar += Character.toString((char) (((c - 'a' + 1) % 26) + 'a'));
		}

		System.out.println(bar);
		 
	}

}
