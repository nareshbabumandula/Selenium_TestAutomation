package com.selenium.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.object.repository.Homepage;

public class LocatorsAdvancedExample extends Homepage{

	WebDriver driver;

	void locatorsTest() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./browsers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.mycontactform.com");
		//driver.findElement(By.linkText("Sample Forms")).click();
		driver.findElement(sampleForms).click(); // Page Object Model
		// Advanced methods in CSS Locator
		driver.findElement(By.cssSelector("input[id='subject']")).sendKeys("Test Subject1");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id='subject']")).clear();
		driver.findElement(By.cssSelector("input[id^='sub']")).sendKeys("Test Subject2");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id$='ject']")).clear();
		driver.findElement(By.cssSelector("input[id$='ject']")).sendKeys("Test Subject3");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id$='ject']")).clear();
		driver.findElement(By.cssSelector("input[id*='jec']")).sendKeys("Test Subject4");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id*='jec']")).clear();
		driver.findElement(By.cssSelector("input#user")).sendKeys("john smith");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input#user")).clear();
		driver.findElement(By.cssSelector("input.txt_log")).sendKeys("sjoerd jager");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input.txt_log")).clear();

		driver.findElement(By.cssSelector("input#user")).sendKeys("john smith");
		driver.findElement(By.cssSelector("input#user")).clear();
		

		// Advanced methods in XPath Locator
		driver.navigate().to("https://www.mycontactform.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/form/fieldset/div/input")).sendKeys("testuser1");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//form/fieldset/div/input")).clear();
		driver.findElement(By.xpath("//form/fieldset/div/input")).sendKeys("testuser2");
		driver.findElement(By.linkText("Sample Forms")).click();
		// XPath with Attributes
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("testuser1@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='email']")).clear();
		driver.findElement(By.xpath("//input[starts-with(@id,'ema')]")).sendKeys("testuser2@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[starts-with(@id,'ema')]")).clear();
		driver.findElement(By.xpath("//input[contains(@id,'mail')]")).sendKeys("testuser3@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@id,'mail')]")).clear();
		driver.findElement(By.xpath("//input[@id='q1' and @name='q1']")).sendKeys("Test Text1");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='q1' and @name='q1']")).clear();
		driver.findElement(By.xpath("//input[@id='q1' or @name='q231']")).sendKeys("Test Text2");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='q1' or @name='q2341']")).clear();
		driver.findElement(By.xpath("//input[@id='q1']|//input[@name='qe1']")).sendKeys("Test Text3");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='q1']|//input[@name='q1123']")).clear();
		WebElement emailAddressLabel = driver.findElement(By.xpath("//label[contains(text(),'E-mail')]"));
		boolean bFlag = emailAddressLabel.isDisplayed();
		System.out.println("Email address field display status is : " + bFlag);
		System.out.println(emailAddressLabel.isEnabled());
		System.out.println(emailAddressLabel.getText());
		System.out.println(driver.findElement(By.xpath("//label[@*='email']")).getText());
		
		WebElement username = driver.findElement(By.id("user"));
		System.out.println(username.getAttribute("name"));
		System.out.println(username.getAttribute("type"));
		System.out.println(username.getAttribute("class"));
		System.out.println(username.getAttribute("id"));
		System.out.println(username.getAttribute("tabindex"));
		username.sendKeys("testuser");
		System.out.println(username.getAttribute("value"));
		
		driver.navigate().to("http://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement tool = driver.findElement(By.xpath("//select[@id='dropdowm-menu-1']/following-sibling::*"));
		System.out.println(tool.getAttribute("id"));
		
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;  
		jsExecutor.executeScript("arguments[0].style.border='2px solid red'", tool);
		Thread.sleep(2000);
		Select select = new Select(tool); // We use Select class to work with dropdown list box
		select.selectByIndex(3);
		Thread.sleep(2000);
		select.selectByIndex(2);
		Thread.sleep(2000);
		
		
		Thread.sleep(4000);
		driver.quit(); // Terminate the browser

	}

	public static void main(String[] args) throws InterruptedException {
		LocatorsAdvancedExample lt = new LocatorsAdvancedExample(); // Create an object reference for a class
		lt.locatorsTest();
	}


}
