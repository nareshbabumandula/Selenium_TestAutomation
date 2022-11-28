package com.selenium.scripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

public class DragandDropTest extends BaseClass{

	WebDriver driver;

	@Test(groups = {"smoke"})
	public void draganddropBy() throws InterruptedException {

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
				test.log(LogStatus.PASS, "Successfully dragged the object");
			}else{
				test.log(LogStatus.FAIL, "Failed to drag the object");
			}
		}
		
	}
	
	@Test(groups = {"smoke"})
	public void draganddrop() throws InterruptedException {
		
		boolean droppedFlag=false;
		try {
			WebElement draggable = driver.findElement(By.linkText("Droppable"));
			draggable.click();
			driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
			WebElement source = driver.findElement(By.xpath("//p[contains(text(), 'Drag me to my target')]"));
			WebElement destination = driver.findElement(By.id("droppable")); 
			Actions action = new Actions(driver);
			action.dragAndDrop(source, destination).perform();
			Thread.sleep(3000);
			droppedFlag = driver.findElement(By.xpath("//p[contains(text(), 'Dropped!')]")).isDisplayed();
			driver.switchTo().defaultContent();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(droppedFlag){
				test.log(LogStatus.PASS, "Successfully dragged and dropped the object");
			}else{
				test.log(LogStatus.FAIL, "Failed to drag and drop the object");
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
