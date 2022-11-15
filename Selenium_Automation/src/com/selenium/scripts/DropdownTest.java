package com.selenium.scripts;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

public class DropdownTest extends BaseClass{

	WebDriver driver;

	@Test(groups = {"smoke"})
	public void dropdownMethods() throws InterruptedException {
		boolean bFlag=false;
		try {
			WebElement candianProvinces = driver.findElement(By.id("q10"));
			Select select = new Select(candianProvinces);
	
			select.selectByIndex(0);
			Thread.sleep(2000);
			select.selectByVisibleText("Ontario");
			Thread.sleep(2000);
			
			List<WebElement> options = select.getOptions();
			System.out.println("No of items displayed in the candian provinces dropdown are : " + options.size());
			
			for (int i = 0; i < options.size(); i++) {
				System.out.println(options.get(i).getText());
				i=i+1;
			}
			
			bFlag=true;
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(bFlag){
				test.log(LogStatus.PASS, "Successfully selected values from the dropdown");
			}else{
				test.log(LogStatus.FAIL, "Failed to select values from the dropdown");
			}
		}
		
	}

	@BeforeClass
	public void launchBrowser() {
		test = report.startTest("EGW_TC004");
		System.setProperty("webdriver.chrome.driver", "./browsers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.mycontactform.com/samples.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

	@AfterClass
	public void closeBrowser() {
		driver.quit();
	}

}
