package com.qa.pagesObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditCustomerPage {
	
	public WebDriver driver;
	
	

	public EditCustomerPage(WebDriver driver) {

		driver=driver;
		PageFactory.initElements(driver, this);

	}
	
	
	//Web Objects
	
	@FindBy(name="cusid")
	WebElement cutomerid;
	
	@FindBy(name="AccSubmit")
	WebElement submitButton;
	
	//Edit mobile no
	@FindBy(name="telephoneno")
	WebElement mobileNo;
	
	//Edit--> submit button
	@FindBy(name="sub")
	WebElement EditsubmitButton;
	
	
	
	
	
	//Action methods
	
	public void ClickOnSubmitButtonAfterEdit() {
		
		EditsubmitButton.click();
	}
	
	
	public void EditMobileNumber(String mobno) {
		mobileNo.clear();
		mobileNo.sendKeys(mobno);
	}
	
	public void clickOnsubmitButton() {
		
		submitButton.click();
		
	}
	
	
	
	
	public void setCustomerid() {
		
		cutomerid.sendKeys(AddNewCustomerPage.customerID);
	}

}
