package com.testng.annotations.demo;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class Common {
	
	@BeforeSuite
	void launchBrowser() {
		System.out.println("Executing launchBrowser method..!");
	}
	
	@AfterSuite(alwaysRun = false)
	void teardown() {
		System.out.println("Executing teardown method..!");
	}

}
