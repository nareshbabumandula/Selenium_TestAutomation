package com.selenium.scripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

public class ImageTest extends BaseClass{

	WebDriver driver;

	@Test(groups = {"smoke"})
	public void imageMethods() throws InterruptedException {
		boolean blnTestimonial=false;
		try {
			WebElement testimonial = driver.findElement(By.xpath("//img[contains(@alt,'Testimonial Thumbnail')]"));
			System.out.println(testimonial.isDisplayed());
			System.out.println(testimonial.isEnabled());
			System.out.println(testimonial.getTagName());
			System.out.println(testimonial.getAttribute("src"));
			testimonial.click();
			Thread.sleep(2000);
			Assert.assertEquals(testimonial.isDisplayed(), true, "Testimonial image is not displayed");
			blnTestimonial=true;
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(blnTestimonial){
				test.log(LogStatus.PASS, "Testimonial image is displayed");
			}else{
				test.log(LogStatus.FAIL, "Testimonial image is not displayed");
			}
		}
		
	}

	@BeforeClass
	public void launchBrowser() {
		test = report.startTest("EGW_TC001");
		System.setProperty("webdriver.chrome.driver", "./browsers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.mycontactform.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

	@AfterClass
	public void closeBrowser() {
		driver.quit();
	}

}
