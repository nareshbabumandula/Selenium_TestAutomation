package com.selenium.scripts;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.object.repository.Loginpage;

public class TC001 {
	
	static WebDriver driver;
	
	public static void accessSite() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\browsers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); // Implicit wait
		driver.get("https://www.mycontactform.com/");
		Thread.sleep(3000);
	}
	
	public static void verifyLogin() throws InterruptedException {
		Loginpage lp = PageFactory.initElements(driver, Loginpage.class);
		lp.setUsername("padma");
		Thread.sleep(2000);
		System.out.println(lp.getUsername());
		lp.setPassword("Secure*1234");
		Thread.sleep(2000);
		System.out.println(lp.getPassword());
		lp.clickLogin();
	}

	public static void main(String[] args) throws InterruptedException {
		accessSite();
		verifyLogin();
		Thread.sleep(2000);
		driver.quit(); // Terminate the browser
		
	}

}
