package com.qa.pagesObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	//Initialize webdriver
	
	public WebDriver driver;
	
	//Constructor
	
	public LoginPage(WebDriver driver) {
		
		driver=driver;
		PageFactory.initElements(driver, this);
		
		
	}
	
	//Page Objects
	
	@FindBy(name="uid")
	WebElement userid;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(name="btnLogin")
	WebElement loginbutton;
	
	//Action Methods
	public void setUsername(String uname) {
		
		userid.sendKeys(uname);
		
	}
	
	public void setPassword(String pwd) {
		
		password.sendKeys(pwd);
	}
	
	public void ClickOnLogin() {
		
		loginbutton.click();
	}
	
	

}
