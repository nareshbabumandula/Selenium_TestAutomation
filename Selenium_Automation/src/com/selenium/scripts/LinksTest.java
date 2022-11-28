package com.selenium.scripts;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinksTest {

	static WebDriver driver;
	
	static void getLinkNames(String browser) throws InterruptedException {
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
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		List<WebElement> nLinks = driver.findElements(By.tagName("a"));
		
		for (int i = 0; i < nLinks.size(); i++) {
			System.out.println(nLinks.get(i).getText());
		}
		
		//nLinks.forEach((link)->link.getText());
		driver.quit();
	}
	
	public static void main(String[] args) throws InterruptedException {
		getLinkNames(" chrome ");
	}
}
