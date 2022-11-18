package com.selenium.scripts;

import java.io.File;
import java.time.Duration;
import java.util.logging.FileHandler;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.google.common.io.Files;
import com.relevantcodes.extentreports.LogStatus;

public class TakeScreenShotTest extends BaseClass{

	WebDriver driver;
	
	@Test(groups = {"smoke"})
	public void captureScreenshot() throws InterruptedException {
		boolean bFlag=false;
				
		try {
			TakesScreenshot srcShot = (TakesScreenshot)driver;
			File srcFile = srcShot.getScreenshotAs(OutputType.FILE);
		    File destFile = new File("./screenshots/TC007.png");
		    Files.copy(srcFile, destFile);
			
			bFlag=true;
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(bFlag){
				test.log(LogStatus.PASS, "Successfully captured the screenshot");
			}else{
				test.log(LogStatus.FAIL, "Failed to capture the screenshot");
			}
		}
		
	}
	
	

	@BeforeClass
	public void launchBrowser() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		test = report.startTest("EGW_TC007");
		System.setProperty("webdriver.chrome.driver", "./browsers/chromedriver.exe");
		driver = new ChromeDriver(options);
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); // Implicit wait
	}

	@AfterClass
	public void closeBrowser() {
		driver.quit();
	}

}
