package com.testng.annotations.demo;

import org.testng.annotations.DataProvider;

public class TestData {

	@DataProvider(name = "data")
	public Object[][] createData1() {
	 return new Object[][] {
	   { "Username", "Naresh" },
	   { "Password", "Secure*12"},
	 };
	}

}
