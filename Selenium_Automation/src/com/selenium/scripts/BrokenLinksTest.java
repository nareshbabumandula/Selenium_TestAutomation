package com.selenium.scripts;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinksTest {

	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./browsers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://ultimateqa.com/complicated-page");
		driver.manage().window().maximize(); // Maximize the browser window
		
		List<WebElement> nLinks = driver.findElements(By.tagName("a"));
		System.out.println("No of links found in Sample Forms page are : "  +nLinks.size());
		
		for (int i = 0; i < nLinks.size(); i++) {
			System.out.println(nLinks.get(i).getText());
		}
		HttpURLConnection huc = null;
		int respcode = 200;
		String url="";
		String linkName="";
		
		java.util.Iterator<WebElement> iter = nLinks.iterator();
		
		while (iter.hasNext()) {
			url = iter.next().getAttribute("href");
			linkName = iter.next().getText(); // Retrieve link name
					
			if (url==null || url.isEmpty()) {
				System.out.println("URL is not configured properly for link : " +linkName);
			} 
			
			try {
				huc  = (HttpURLConnection)(new URL(url).openConnection());
				huc.setRequestMethod("HEAD");
				respcode = huc.getResponseCode();
				
				if (respcode>=400) {
					System.out.println(linkName + " : is a broken link");
				} else {
					System.out.println(linkName + " : is a valid link");
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
				
		Thread.sleep(3000);
		driver.quit();
		
	}

}
