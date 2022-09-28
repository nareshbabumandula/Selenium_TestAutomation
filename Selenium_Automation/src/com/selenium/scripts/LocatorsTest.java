package com.selenium.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.object.repository.Homepage;

public class LocatorsTest extends Homepage{

	WebDriver driver;
	
	void locatorsTest() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./browsers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.mycontactform.com");
		driver.findElement(By.id("user")).sendKeys("testuser");
		Thread.sleep(3000);
		driver.findElement(By.name("pass")).sendKeys("Secure*1234");
		Thread.sleep(2000);
		driver.findElement(By.className("txt_log")).clear();
		Thread.sleep(2000);
		driver.findElement(By.className("txt_log")).sendKeys("Ravi");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Sample Forms")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[name='email_to[]']")).click();
		Thread.sleep(2000);
		driver.findElement(By.tagName("input")).sendKeys("Test Field");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("naresh223@gmail.com");
		Thread.sleep(2000);	
		driver.findElement(By.partialLinkText("Feat")).click();
		Thread.sleep(4000);
		driver.quit(); // Terminate the browser
	}

	public static void main(String[] args) throws InterruptedException {
		LocatorsTest lt = new LocatorsTest(); // Create an object reference for a class
		lt.locatorsTest();
	}

	
}
