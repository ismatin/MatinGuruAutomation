package com.qa.testCases;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class BaseClass {

	public WebDriver driver;
	public Logger logger;
	public static Properties prop;
	
	public static String USERNAME="mngr252965";
	 public static String PASSWORD="jYvUruj";

	 
	 @Parameters({"Browser"})
	@BeforeMethod
	public void Setup(String BrowserName) throws IOException {


		logger=Logger.getLogger("GuruAutomationProject");
		PropertyConfigurator.configure("log4j.properties");
		
		String path=System.getProperty("user.dir");

		FileInputStream fis=new FileInputStream(path+"\\Configuration\\config.properties");
		prop=new Properties();
		prop.load(fis);

		//String BrowserName=prop.getProperty("Browser");

		if(BrowserName.equals("chrome")) {

			String ProjectPath=System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver", ProjectPath+"\\Driver\\chromedriver.exe");
			driver=new ChromeDriver();
			logger.info("Chrome Browser Launched..");
		}
		else if(BrowserName.equals("firefox")) {

			String ProjectPath=System.getProperty("user.dir");
			System.setProperty("webdriver.gecko.driver", ProjectPath+"\\Driver\\geckodriver.exe");
			driver=new FirefoxDriver();
			logger.info("Firefox Browser Launched..");

		}

		else {

			logger.info("No Browser Exist in the system..");
		}

		//Property set up




		driver.manage().window().maximize();
		logger.info("Browser Window Maximized..");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get(prop.getProperty("URL"));
		logger.info("URL Launched..");



	}




	@AfterMethod
	public void tearDown() {

		//driver.quit();


	}





}
