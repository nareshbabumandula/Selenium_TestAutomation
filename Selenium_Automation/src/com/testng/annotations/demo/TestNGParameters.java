package com.testng.annotations.demo;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.object.repository.Loginpage;

public class TestNGParameters extends Loginpage{

  WebDriver driver;
  
  @Parameters({"username", "password"})
  @Test
  public void login(String username, String password) {
	  Loginpage lp = PageFactory.initElements(driver, Loginpage.class);
	  lp.setUsername(username);
	  lp.setPassword(password);
	  lp.clickLogin();
  }
  
  @BeforeClass
  public void accessSite() {
	 System.setProperty("webdriver.chrome.driver", "./browsers/chromedriver.exe");
	 driver = new ChromeDriver();
	 driver.get("https://www.mycontactform.com/");
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
  }

  @AfterClass
  public void closeBrowser() throws InterruptedException {
	  Thread.sleep(4000);
	  driver.quit();
  }

}
