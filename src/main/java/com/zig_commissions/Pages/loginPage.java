package com.zig_commissions.Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.zig_commissions.Utilities.Initialize_browser;

public class loginPage extends Initialize_browser{
	
WebDriverWait wait = new WebDriverWait(driver,30);
	
	public loginPage() {
      PageFactory.initElements(driver, this); 
	}
	
	@FindBy(xpath ="//input[@id='login_input']")
    public WebElement userNameTxt;
	
	
	@FindBy(xpath="//input[@id='password']")
    public WebElement passwordTxt;
	
	@FindBy (xpath = "//button[@type='submit']")
    public WebElement signbtn;
	
	
	public homePage logIn() {
		try
		{
			JavascriptExecutor exe = (JavascriptExecutor) driver;
			  Integer noOfFrames = Integer.parseInt(exe.executeScript("return window.length").toString());
			  System.out.println("No. of iframes on the login page are " + noOfFrames);
		wait.until(ExpectedConditions.visibilityOf((userNameTxt)));
		userNameTxt.sendKeys("bm169s");
		passwordTxt.sendKeys("Vijaya$50");
		signbtn.click(); 
		return new homePage();
		}
		catch(Exception e)
		{
			signbtn.click();
			return new homePage();

		}
		
			}

}
