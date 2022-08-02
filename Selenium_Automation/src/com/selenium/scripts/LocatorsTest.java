package com.selenium.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsTest {

	WebDriver driver;
	
	void locatorsTest() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./browsers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.mycontactform.com");
		driver.findElement(By.id("user")).sendKeys("rakesh");
		driver.findElement(By.name("pass")).sendKeys("Secure*1234");
		Thread.sleep(4000);
		driver.quit(); // Terminate the browser
	}

	public static void main(String[] args) throws InterruptedException {
		LocatorsTest lt = new LocatorsTest(); // Create an object reference for a class
		lt.locatorsTest();
	}

	
}
