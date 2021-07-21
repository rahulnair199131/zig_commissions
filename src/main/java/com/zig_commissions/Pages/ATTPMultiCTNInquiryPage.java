package com.zig_commissions.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.zig_commissions.Utilities.Constants;
import com.zig_commissions.Utilities.Initialize_browser;

public class ATTPMultiCTNInquiryPage extends Initialize_browser{
	
WebDriverWait wait = new WebDriverWait(driver,Constants.waitDuration);
	
	public ATTPMultiCTNInquiryPage() {
		
      PageFactory.initElements(driver, this); 
	}
	
	
	@FindBy(xpath="//strong[text()='ATTP Multi CTN Inquiry']")
	public WebElement attpMultiLabel;
	
	
	public void attpmultictnfileUpload() {
		
		wait.until(ExpectedConditions.visibilityOf((attpMultiLabel)));
	}

}
