package com.selenium.scripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

public class SeleniumExceptionsTest extends BaseClass{

	WebDriver driver;

	@Test(groups = {"smoke"})
	public void seleniumExceptions() throws InterruptedException {
		boolean blnTestimonial=false;
		try {
			//********************************************************************************
			//driver.findElement(By.linkText("Draggable123")); // NoSuchElementException
			//********************************************************************************
			//driver.findElement(By.linkText("Autocomplete")).click();
			//driver.switchTo().frame(1); // NoSuchFrameException
			//********************************************************************************
			 //String mainwindow = driver.getWindowHandle();
			 //driver.switchTo().window(mainwindow+123);  // NoSuchWindowException:
			//********************************************************************************
			  //driver.findElement(By.cssSelector("//input.ds-input")).sendKeys("selenium"); // InvalidSelectorException
			//********************************************************************************  
			 WebElement draggable = driver.findElement(By.linkText("Draggable"));
			 JavascriptExecutor jsExecutor = (JavascriptExecutor)driver;
			 jsExecutor.executeScript("history.go(0)"); // Page Refresh
			 System.out.println(draggable.isDisplayed());  // StaleElementReferenceException
			 System.out.println(draggable.isEnabled());
			//********************************************************************************  
			 Thread.sleep(3000);
			
			blnTestimonial=true;
		} catch (Exception e) {
			e.printStackTrace(); 
		}finally {
			if(blnTestimonial){
				test.log(LogStatus.PASS, "Testimonial image is displayed");
			}else{
				test.log(LogStatus.FAIL, "Testimonial image is not displayed");
			}
		}
		
	}

	@BeforeClass
	public void launchBrowser() {
		test = report.startTest("EGW_TC008");
		System.setProperty("webdriver.chrome.driver", "./browsers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://jqueryui.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

	@AfterClass
	public void closeBrowser() {
		driver.quit();
	}

}
