package com.selenium.scripts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
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

public class ActionsTest extends BaseClass{

	WebDriver driver;
	
	@Test(groups = {"smoke"})
	public void menuMethods() throws InterruptedException {
		boolean bFlag=false;
				
		try {
			Actions action = new Actions(driver);
			WebElement addons = driver.findElement(By.xpath("//div[contains(text(),'Add-ons')]"));
			action.moveToElement(addons).click().perform();		
			//action.click(addons).perform();
			// Explicit wait
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[contains(text(),'Extra Seat')])[1]")));
						
			boolean extraseat = driver.findElement(By.xpath("(//div[contains(text(),'Extra Seat')])[1]")).isDisplayed();
			System.out.println(extraseat);
			driver.findElement(By.xpath("(//div[contains(text(),'Extra Seat')])[1]")).click();
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
	
	@Test(groups = {"smoke"})
	void actionsmethods() throws InterruptedException, AWTException {
		Actions action = new Actions(driver);
		WebElement logo = driver.findElement(By.xpath("//img[contains(@src,'public/v1.svg')]"));
		action.contextClick(logo).perform();
		Thread.sleep(3000);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ESCAPE);
		Thread.sleep(3000);
		
	}

	@BeforeClass
	public void launchBrowser() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		test = report.startTest("EGW_TC005");
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
