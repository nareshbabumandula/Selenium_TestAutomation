package com.selenium.scripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TextboxTest {
	
  WebDriver driver;
  
  //Marks a class or a method as part of the test.
  @Test()
  public void searchStore() {
	  driver.findElement(By.id("inputStoreValue")).sendKeys("Tampa");
	  driver.findElement(By.xpath("//button[contains(text(),'Find a Store')]")).click();
	  String strCity = driver.findElement(By.id("q")).getAttribute("value");
	  Assert.assertEquals(strCity, "Tampa", "Searched city name is not displayed in the search results");
	  boolean blnGetDirections = driver.findElement(By.xpath("//a[contains(text(),'Get Directions')]")).isDisplayed();
	  Assert.assertTrue(blnGetDirections, "true");
	  Reporter.log("Successfully searched a product.!");
	  System.out.println("Successfully searched a product.!");
  }
     
  //The annotated method will be run before the first test method in the current class is invoked.
  @BeforeClass
  public void launchBrowser() {
	  try {
		  System.setProperty("webdriver.chrome.driver", "./browsers/chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.get("https://www.eyeglassworld.com/");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		  boolean blnFindStore = driver.findElement(By.xpath("//button[contains(text(),'Find a Store')]")).isDisplayed();
		  Assert.assertEquals(blnFindStore, true, "Find a Store option label is not displayed");
		  System.out.println("Successfully launched the browser..!");
	} catch (Exception e) {
		e.printStackTrace();
	}
 }

  // The annotated method will be run after all the test methods in the current class have been run
  @AfterClass
  public void closeBrowser() {
	  driver.quit();
	  System.out.println("Successfully closed the browser..!");
  }


}
