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

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class EGW_TC001 {
	
  WebDriver driver;
  static ExtentTest test;
  static ExtentReports report;
  
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
		  
		  // Extent Reports
		  report = new ExtentReports("./ExtentReportResults.html");
		  test = report.startTest("EGW_TC001");
		  
		  System.setProperty("webdriver.chrome.driver", "./browsers/chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.get("https://www.eyeglassworld.com/");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		  boolean blnFindStore = driver.findElement(By.xpath("//button[contains(text(),'Find a Store')]")).isDisplayed();
		  Assert.assertEquals(blnFindStore, true, "Find a Store option label is not displayed");
		  System.out.println("Successfully launched the browser..!");
		  if(blnFindStore){
			  test.log(LogStatus.PASS, "Find a Store option label is displayed");
		  }else{
			  test.log(LogStatus.FAIL, "Find a Store option label is not displayed");
		  }
	} catch (Exception e) {
		e.printStackTrace();
	}
 }

  // The annotated method will be run after all the test methods in the current class have been run
  @AfterClass
  public void closeBrowser() {
	  report.endTest(test);
	  report.flush();
	  driver.quit();
	  System.out.println("Successfully closed the browser..!");
  }


}
