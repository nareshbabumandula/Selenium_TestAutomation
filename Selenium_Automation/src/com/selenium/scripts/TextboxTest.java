package com.selenium.scripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

public class TextboxTest extends BaseClass{

	WebDriver driver;

	@Test(groups = {"smoke"})
	public void textboxMethods() throws InterruptedException {
		String actUsername="";
		try {
			WebElement username = driver.findElement(By.id("user"));
			System.out.println(username.isDisplayed());
			System.out.println(username.isEnabled());
			System.out.println(username.getTagName());
			System.out.println(username.getAttribute("type"));
			System.out.println(username.getAttribute("class"));
			System.out.println(username.getAttribute("name"));
			System.out.println(username.getAttribute("id"));
			System.out.println(username.getAttribute("tabindex"));
			username.sendKeys("priyanka");
			Thread.sleep(2000);
			actUsername = username.getAttribute("value");

			System.out.println("Value entered in the username field is : " + actUsername);
			Assert.assertEquals(actUsername, "priyanka", "Actual username is not same as expected");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}finally {
			if(actUsername.equals("priyanka")){
				test.log(LogStatus.PASS, "Successfully entered in the username field is : " + actUsername);
			}else{
				test.log(LogStatus.FAIL, "Value entered in the username field is not correct");
			}
		}
	}

	@BeforeClass
	public void launchBrowser() {
		test = report.startTest("EGW_TC002");
		System.setProperty("webdriver.chrome.driver", "./browsers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.mycontactform.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

	@AfterClass
	public void closeBrowser() {
		driver.quit();
	}

}
