package com.qa.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.pagesObjects.LoginPage;

public class TC_LoginPageTest_001 extends BaseClass {
	
	
	@Test
	public void LoginTest() {
		
		LoginPage login=new LoginPage(driver);
		login.setUsername(USERNAME);
		logger.info("Entered Username..");
		login.setPassword(PASSWORD);
		logger.info("Entered Password..");
		login.ClickOnLogin();
		logger.info("Login Button Clicked..");
		
		
		String HomepageURL=driver.getCurrentUrl();
		if(HomepageURL.equals("http://demo.guru99.com/V4/manager/Managerhomepage.php")) {
			
			Assert.assertTrue(true);
			logger.info("TC_LoginPageTest_001 Passed..");
		}
		else {
			
			Assert.assertTrue(false);
			logger.info("TC_LoginPageTest_001 Failed..");
		}
		
	}

}
