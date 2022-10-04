package com.selenium.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class BrowserTest {

	static WebDriver driver;
	
	
	static void launchBrowser(String browser) throws InterruptedException {
		String os = System.getProperty("os.name").toLowerCase();
		
		switch (browser.toLowerCase().trim()) {
		case "edge":
		    System.setProperty("webdriver.edge.driver", "./browsers/msedgedriver.exe");
			driver = new EdgeDriver();
		    break;
		case "chrome":
			if(os.contains("mac")) {
				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "/browsers/chromedriver");
			}else {
				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+  "\\browsers\\chromedriver.exe");
			}
		    driver = new ChromeDriver();
		    break;
		case "ff": case "firefox":
		    System.setProperty("webdriver.gecko.driver", "./browsers/geckodriver.exe");
			driver = new FirefoxDriver();
		    break;
		default:
			System.out.println("Invalid browser");
			break;
		}
		driver.get("https://www.mycontactform.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.navigate().to("https://www.mycontactform.com/samples.php");
		System.out.println(driver.getCurrentUrl());
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		//System.out.println(driver.getPageSource());
		//driver.findElement(By.id("user")).sendKeys("ramesh");
		//driver.findElement(By.id("pass")).sendKeys("Secure*1234");
		driver.findElement(By.id("user")).sendKeys("test");
		Thread.sleep(4000);
		//driver.switchTo().newWindow(WindowType.TAB);
		driver.quit();
	}
	
	public static void main(String[] args) throws InterruptedException {
		launchBrowser(" chrome ");
	}
}
