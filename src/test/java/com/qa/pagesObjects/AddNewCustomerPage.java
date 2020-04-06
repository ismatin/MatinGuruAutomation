package com.qa.pagesObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import net.bytebuddy.utility.RandomString;

public class AddNewCustomerPage {

	public WebDriver driver;
	public static String customerID;

	public AddNewCustomerPage(WebDriver driver) {

		driver=driver;
		PageFactory.initElements(driver, this);

	}

	//page objects
	@FindBy(linkText="New Customer")
	WebElement AddNewCustomerLink;

	@FindBy(name="name")
	WebElement customername;
	
	@FindBy(name="rad1")
	WebElement gender;

	@FindBy(name="dob")
	WebElement CustDOB;

	@FindBy(name="addr")
	WebElement address;

	@FindBy(name="city")
	WebElement city;


	@FindBy(name="state")
	WebElement state;

	@FindBy(name="pinno")
	WebElement pinno;

	@FindBy(name="telephoneno")
	WebElement telephoneno;

	@FindBy(name="emailid")
	WebElement emailid;


	@FindBy(name="password")
	WebElement password;


	@FindBy(name="sub")
	WebElement sub;

	@FindBy(xpath="//table[@id='customer']//tbody//tr[4]//td[2]")
	WebElement Custid;
	
	
	
	public void GetCutomerID() {
		
	 customerID=Custid.getText();
		
		
	}
	
	

	public void clickOnAddNewCustomerLink() {

		AddNewCustomerLink.click();
	}


	public void setCustomerName(String CustName) {

		customername.sendKeys(CustName);
	}
	
	
	public void SetGender() {
		
		gender.click();
	}
	

	public void setDOB(String dd, String mm, String yy)  {

		CustDOB.sendKeys(dd);
		
		CustDOB.sendKeys(mm);
		
		CustDOB.sendKeys(yy);
	}

	public void setAddress(String CustAddress) {

		address.sendKeys(CustAddress);
	}

	public void setCity(String CustCity) {

		city.sendKeys(CustCity);
	}
	
	public void setState(String CustState) {

		state.sendKeys(CustState);
	}

	
	public void setPin(int CustPin) {

		pinno.sendKeys(String.valueOf(CustPin));
	}
	
	public void setTelephoneno(String CustMobNo) {

		telephoneno.sendKeys(CustMobNo);
	}
	

	
	
	public void setEmailid(String Custemail) {

		
		emailid.sendKeys(Custemail);
	}
	
	public void setPassword(String CustPassword) {

		password.sendKeys(CustPassword);
	}
	
	public void ClickOnSubmitButton() {

		sub.click();
	}
	

}
