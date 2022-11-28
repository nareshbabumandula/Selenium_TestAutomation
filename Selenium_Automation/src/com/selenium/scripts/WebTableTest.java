package com.selenium.scripts;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

public class WebTableTest extends BaseClass{

	WebDriver driver;

	@Parameters({"firstname"})
	@Test(groups = {"smoke"})
	public void webtableMethods(String firstName) throws InterruptedException {
		boolean bFlag=false;
		try {
			List<WebElement> nRows = driver.findElements(By.xpath("//table[@id='t01']/tbody/tr"));
			int rowcount = nRows.size();
			System.out.println("No of rows in a webtable are : " + rowcount);
			List<WebElement> nColumns = driver.findElements(By.xpath("//table[@id='t01']/tbody/tr/th"));
			int colCount = nColumns.size();
			System.out.println("No of columns in a webtable are : " + colCount);
			
			for (int i = 2; i <= rowcount; i++) {
				for (int j = 1; j <= colCount; j++) {
					String cellText = driver.findElement(By.xpath("//table[@id='t01']/tbody/tr["+i+"]/td["+j+"]")).getText();
					System.out.println(cellText);
					
					if (cellText.equals(firstName)) {
						String age = driver.findElement(By.xpath("//table[@id='t01']/tbody/tr["+i+"]/td[3]")).getText();
						System.out.println("Age of " +firstName+ " is : " + age);
						test.log(LogStatus.PASS, "Age of " +firstName+ " is : " + age);
					}
				}
			}
			
			bFlag=true;
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(bFlag){
				test.log(LogStatus.PASS, "Successfully performed operations on webtable");
			}else{
				test.log(LogStatus.FAIL, "Failed to perform operations on webtable");
			}
		}
	}

	@BeforeClass
	public void launchBrowser() {
		test = report.startTest("EGW_TC009");
		System.setProperty("webdriver.chrome.driver", "./browsers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/Data-Table/index.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

	@AfterClass
	public void closeBrowser() {
		driver.quit();
	}

}
