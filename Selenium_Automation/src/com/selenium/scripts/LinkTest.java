package com.selenium.scripts;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

public class LinkTest extends BaseClass{

	WebDriver driver;

	@Test(groups = {"smoke"})
	public void linkMethods() throws InterruptedException {
		boolean blnLinkFlag=false;
		String strLink="";
		String errMessage="";
		try {
			//WebElement termsandConditions = driver.findElement(By.linkText("Terms and Conditions"));
			WebElement termsandConditions = driver.findElement(By.partialLinkText("Terms and"));
			
			System.out.println(termsandConditions.isDisplayed());
			System.out.println(termsandConditions.isEnabled());
			System.out.println(termsandConditions.getTagName());
			System.out.println(termsandConditions.getAttribute("href"));
			System.out.println(termsandConditions.getText());
			strLink = termsandConditions.getText();
			String mainwindow = driver.getWindowHandle(); // parent window
			System.out.println(mainwindow);
			termsandConditions.click();
			Thread.sleep(2000);
			Set<String> windows = driver.getWindowHandles();
			System.out.println(windows);
			Iterator<String> iter = windows.iterator();

			while (iter.hasNext()) {
				String childwindow = iter.next();
				System.out.println(childwindow);
				if (!childwindow.equals(mainwindow)) {
					driver.switchTo().window(childwindow);
					blnLinkFlag = driver.findElement(By.xpath("//h2[contains(text(),'Terms of')]")).isDisplayed();
					if (blnLinkFlag) {
						test.log(LogStatus.PASS, "Navigated to TERMS OF CARRIAGE page");
					}
					//Assert.assertEquals(blnLinkFlag, true);
					driver.close();
				}
			}
			
			driver.switchTo().window(mainwindow);
			driver.navigate().refresh();
			System.out.println(driver.getCurrentUrl());
			System.out.println(driver.getTitle());
			Thread.sleep(4000);
			boolean logo = driver.findElement(By.xpath("//img[@src='https://www.spicejet.com/public/v1.svg']")).isEnabled();
			if (logo) {
				test.log(LogStatus.PASS, "Successfully navigated back to main window");
			}
			Thread.sleep(4000);

		} catch (Exception e) {
			e.printStackTrace();
			errMessage = e.getMessage();
		}finally {
			if(blnLinkFlag){
				test.log(LogStatus.PASS, "Successfully clicked on link : " + strLink);
			}else{
				test.log(LogStatus.FAIL, "Failed to click on link : " + strLink + " since " + errMessage);
			}
		}

	}

	@BeforeClass
	public void launchBrowser() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		test = report.startTest("EGW_TC003");
		System.setProperty("webdriver.chrome.driver", "./browsers/chromedriver.exe");
		driver = new ChromeDriver(options);
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@AfterClass
	public void closeBrowser() {
		driver.quit();
	}

}
