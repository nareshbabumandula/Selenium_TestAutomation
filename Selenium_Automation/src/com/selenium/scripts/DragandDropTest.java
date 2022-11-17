package com.selenium.scripts;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

public class DragandDropTest extends BaseClass{

	WebDriver driver;

	@Test(groups = {"smoke"})
	public void menuMethods() throws InterruptedException {
		boolean bFlag=false;
		try {
			WebElement draggable = driver.findElement(By.linkText("Draggable"));
			draggable.click();
			driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
			WebElement drag = driver.findElement(By.id("draggable"));
			Actions action = new Actions(driver);
			action.dragAndDropBy(drag,300, 150).perform();
			Thread.sleep(3000);
			bFlag=true;
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(bFlag){
				test.log(LogStatus.PASS, "Successfully hovered the mouse on menu");
			}else{
				test.log(LogStatus.FAIL, "Failed to hover the mouse on menu");
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
