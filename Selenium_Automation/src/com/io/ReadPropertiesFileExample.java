package com.io;

import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class ReadPropertiesFileExample {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("./data/application.properties");
		Properties prop = new Properties();
		prop.load(fr);
		System.out.println(prop.getProperty("url"));
		System.out.println(prop.getProperty("username"));
		System.out.println(prop.getProperty("password"));
		
		// Set collection on propertes
		Set set = prop.entrySet();
		Iterator iter = set.iterator();
		while (iter.hasNext()) {
			Map.Entry entry = (Map.Entry)iter.next();
			System.out.println(entry.getKey() + "=" + entry.getValue());
		}
		
	}
}
