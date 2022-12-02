package com.testng.annotations.demo;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Generic {

	
	@BeforeTest
	void accessSite() {
		System.out.println("Executing accessSite method..!");
	}
	
	@AfterTest
	void closeBrowser() {
		System.out.println("Executing closeBrowser method..!");
	}
}
