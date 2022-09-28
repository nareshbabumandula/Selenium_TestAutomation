package com.datatypes;

public class StringMethod {

	public static void main(String[] args) {
		String str="hello world";
		String sTEXT="HELLO";
		
		System.out.println(str);
		System.out.println(str.toUpperCase());
		System.out.println(sTEXT.toLowerCase());
		System.out.println(str.charAt(3));
		System.out.println(str.length());
		System.out.println(str.equals("HELLO WORLD"));
		System.out.println(str.equalsIgnoreCase("HELLO WORLD"));
		System.out.println(str.contains("hello"));
		System.out.println(str.indexOf('e'));
		System.out.println(str.lastIndexOf('d'));
		System.out.println(str.startsWith("world"));
		System.out.println(str.endsWith("hello"));
		System.out.println(str.startsWith("hello"));
		System.out.println(str.endsWith("world"));
		System.out.println(str.isEmpty());
		System.out.println(str.isBlank());
		System.out.println(str + "wel come to hyderabad");
		System.out.println(str.replace("hello", "jai,"));
		System.out.println(str.substring(0,4));
		String st="The city of Hyderabad was founded by the Qutb Shahi sultan Muhammad Quli Qutb Shah";
		String asTEXT[]=st.split(" ");
		System.out.println(asTEXT[1]);
		System.out.println(asTEXT[2]);
		System.out.println(asTEXT[0]);
		
        
  
	
	

	}

}
