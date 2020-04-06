package com.qa.testCases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.pagesObjects.EditCustomerPage;
import com.qa.pagesObjects.LoginPage;

public class EditCustomerTest_003 extends BaseClass{
	
	
	@Test
	public void editCustomerDetailsTest() throws InterruptedException {
		
		
		
		//Login
		LoginPage login=new LoginPage(driver);
		login.setUsername(USERNAME);
		logger.info("Entered Username..");
		login.setPassword(PASSWORD);
		logger.info("Entered Password..");
		login.ClickOnLogin();
		logger.info("Login Button Clicked..");
		
		driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[3]/a")).click();
		logger.info("Edit Customer Link Clicked..");
		
		
		Thread.sleep(3000);
		EditCustomerPage editcust=new EditCustomerPage(driver);
		editcust.setCustomerid();
		logger.info("Entered Customer ID..");
		
		
		editcust.clickOnsubmitButton(); 
		logger.info("Submit Button Clicked..");
		
		editcust.EditMobileNumber("9373618395");
		logger.info("Uodated Mobile Number..");
		
		editcust.ClickOnSubmitButtonAfterEdit();
		logger.info("Submit button clicked after updating details..");
		Thread.sleep(3000);
		
		String EditPageTitle=driver.getTitle();
		
		if(EditPageTitle.equals("Guru99 Bank Customer Registration Page")) {
			
			Assert.assertTrue(true);
			logger.info("editCustomerDetailsTest passed..");
		}
		
		else {
			
			Assert.assertTrue(false);
			logger.info("editCustomerDetailsTest failed..");
			
		}
		
		
		
		
		
		
	}
	

}
