package com.selenium.scripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

public class FramesTest extends BaseClass{

	WebDriver driver;

	@Test(groups = {"smoke"})
	public void frameMethods() throws InterruptedException {
		boolean bFlag=false;
		try {
			WebElement autoComplete = driver.findElement(By.linkText("Autocomplete"));
			autoComplete.click();
			//driver.switchTo().frame(0); // Switches to first most frame in the html hierarchy
			//driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
			driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='/resources/demos/autocomplete/default.html']")));
			driver.findElement(By.id("tags")).sendKeys("selenium");
			Thread.sleep(3000);
			driver.switchTo().defaultContent(); // Switches out from the frame
			driver.findElement(By.linkText("Draggable")).click();
			Thread.sleep(3000);
			bFlag=true;
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(bFlag){
				test.log(LogStatus.PASS, "Successfully entered the value in tags textbox");
			}else{
				test.log(LogStatus.FAIL, "Failed to enter value in tags textbox");
			}
		}
		
	}

	@BeforeClass
	public void launchBrowser() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		test = report.startTest("EGW_TC006");
		System.setProperty("webdriver.chrome.driver", "./browsers/chromedriver.exe");
		driver = new ChromeDriver(options);
		driver.get("https://www.jqueryui.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); // Implicit wait
	}

	@AfterClass
	public void closeBrowser() {
		driver.quit();
	}

}
