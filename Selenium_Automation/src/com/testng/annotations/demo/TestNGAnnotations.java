package com.testng.annotations.demo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGAnnotations extends Common{
			
	@AfterClass
	void logout() {
		System.out.println("Executing logout method..!");
	}
	  	
	@BeforeClass
	void login() {
		System.out.println("Executing login method..!");
	}
		
	@BeforeMethod
	void getProduct() {
		System.out.println("Executing getProduct method..!");
	}
	
	@AfterMethod
	void verifyProductAvailability() {
		System.out.println("Executing verifyProductAvailability method..!");
	}
	
	@Test(priority = 0)
	void searchProduct() {
		System.out.println("Successfully searched the product..!");
	}
	
	
	@Test(priority = 1)
	void addToCart() {
		System.out.println("Successfully added the product to the product..!");
	}
	
	
}
