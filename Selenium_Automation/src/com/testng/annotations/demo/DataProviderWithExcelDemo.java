package com.testng.annotations.demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DataProviderWithExcelDemo extends TestData{

	WebDriver driver;

	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "./browsers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.mycontactform.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}

	@Test(dataProvider = "excelData", dataProviderClass = TestData.class)
	public void search(String username, String password, String product, String price) {

		WebElement userID = driver.findElement(By.id("user"));
		userID.sendKeys(username);
		System.out.println("Username entered is : " + username);
		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys(password);
		System.out.println("Password entered is : " + password);
	}

	@AfterMethod
	public void burnDown() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}
}
