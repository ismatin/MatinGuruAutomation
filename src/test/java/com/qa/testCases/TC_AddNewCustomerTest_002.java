package com.qa.testCases;

import org.apache.commons.lang3.RandomStringUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.pagesObjects.AddNewCustomerPage;
import com.qa.pagesObjects.LoginPage;

public class TC_AddNewCustomerTest_002 extends BaseClass{


	@Test
	public void AddNewCustomerTest() throws InterruptedException {

		//First Login Then Add a New Customer
		LoginPage login=new LoginPage(driver);
		login.setUsername(USERNAME);
		login.setPassword(PASSWORD);
		login.ClickOnLogin();

		Thread.sleep(5000);

		//Add a new customer
		AddNewCustomerPage add=new AddNewCustomerPage(driver);

		add.clickOnAddNewCustomerLink();
		logger.info("New Customer Link Clicked..");

		Thread.sleep(5000);

		add.setCustomerName("Matin");
		logger.info("Customer Name  Entered..");

		add.SetGender();
		logger.info("Gender Selected..");


		add.setDOB("10","10","1985");
		Thread.sleep(5000);

		logger.info("Customer DOB Entered..");

		add.setAddress("Pune");
		logger.info("Customers Address Entered..");

		add.setCity("Pune");
		logger.info("Customers City Entered..");

		add.setState("Maharashtra");
		logger.info("Customers State Entered..");

		add.setPin(411015);
		logger.info("Customers Pin Entered..");

		add.setTelephoneno("9900889900");
		logger.info("Customers Mobile Number Entered..");

		String emailid=RandomEmail()+"@gmail.com";
		add.setEmailid(emailid);
		logger.info("Customers Email ID Entered..");

		add.setPassword("Admin@123");
		logger.info("Customers Password Entered..");

		add.ClickOnSubmitButton();
		logger.info("Submit Button Clicked..");
		
		// Get customer id///////////////////
		add.GetCutomerID();

		Thread.sleep(3000);

		String RegistrationTitle=driver.getTitle();
		//System.out.println("RegistrationTitle "+RegistrationTitle);
		if(RegistrationTitle.equals("Guru99 Bank Customer Registration Page"))
		{

			Assert.assertTrue(true);
			logger.info("AddNewCustomerTest is passed"); 
		}
		
		else
			{

				Assert.assertTrue(false); 
				logger.info("AddNewCustomerTest is failed");
				
			}

	}

	public String RandomEmail() {

		String email=RandomStringUtils.randomAlphabetic(5);
		return email;
	}


}
