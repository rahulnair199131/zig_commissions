package com.zig_commissions.Utilities;


import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Initialize_browser  {
	
	public static WebDriver driver = null;
	public static String url ="https://catt-tst.callidusondemand.com/SalesPortal/#!/";
	//public static String url ="https://google.com";
	
	@BeforeSuite
	public static WebDriver initializeBrowser () throws Exception
	{
		
		System.out.println("Adding a comment");
		System.setProperty("webdriver.chrome.driver", "D://chrome//chromedriver.exe");
		
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
		chromeOptions.setExperimentalOption("useAutomationExtension", false);
		
		Map prefs = new HashMap();
		prefs.put("credentials_enable_service", false);
		prefs.put("profile.password_manager_enabled", false);
		chromeOptions.setExperimentalOption("prefs", prefs);
		
		driver = new ChromeDriver(chromeOptions);

		driver.get(url);
		
		driver.manage().window().maximize();
		
		System.out.println("Inside initialize browser block ++++++++");
		

		return driver;
	    
	}
	
	@AfterSuite
	public void closebrowser()
	{
		//driver.quit();
	}
	
}

