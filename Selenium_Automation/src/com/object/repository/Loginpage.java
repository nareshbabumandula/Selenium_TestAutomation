package com.object.repository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Loginpage {
	
	// Object Repository with Page Object Model
	public static By user = By.id("user");
	
	// Object Repository with Page Factory Pattern
	@FindBy(id="user")
	private WebElement username;
	
	@FindBy(id="pass")
	private WebElement password;
	
	@FindBy(name = "btnSubmit")
	private WebElement login;
	
	public String getUsername() {
		return username.getAttribute("value");
	}
	
	public void setUsername(String strUsername) {
		username.sendKeys(strUsername);
	}
	
	public String getPassword() {
		return password.getAttribute("value");
	}
	
	public void setPassword(String strPassword) {
		password.sendKeys(strPassword);
	}
	
	public void clickLogin() {
		login.click();
	}
	
	
}
