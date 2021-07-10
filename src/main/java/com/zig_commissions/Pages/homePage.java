package com.zig_commissions.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.zig_commissions.Utilities.Initialize_browser;

public class homePage extends Initialize_browser{
	
	WebDriverWait wait = new WebDriverWait(driver,30);
	
	
	public homePage() {
        
        PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath ="//span[@class='cald-ui-dropdown svelte-19a8f9t']")
	   public WebElement profileicon;
	  
	  @FindBy(xpath="//div[contains(@class,'cald-ui-dropdown-item')]")
	  public WebElement proxyasicon;

	  //@FindBy (xpath="//input[@class='form-control ui-select-search ng-pristine ng-valid ng-empty ng-touched']")
	  @FindBy (xpath ="//input[@type='search']")
	  public WebElement droptext;
	  
	  
	//@FindBy (xpath = "//span[text()='INCOMM AGENT SOLUTIONS (17801517)']")
	 @FindBy (xpath ="//a[@class='ui-select-choices-row-inner']//span[contains(text(),' INCOMM AGENT SOLUTIONS (17801517)')]")
	  public WebElement selectoption;
	  
	  @FindBy (xpath = "//button[@type='button']") 
	  public WebElement proxybtn;
	
	  @FindBy (xpath = "//span[@class='sap-icon dark-color-sap-icon svelte-1mba5xr']")
	    public WebElement menuicon;
		
		//@FindBy (linkText = "/SalesPortal/#!/workflow")
		@FindBy (xpath = "//a[@href ='/SalesPortal/#!/workflow']")
	    public WebElement workflow;
		
		
		
		  public void profilemenu()
		  { 
		  Actions action = new Actions(driver);
		  wait.until(ExpectedConditions.visibilityOf((profileicon)));
		  profileicon.click(); 
		  action.moveToElement(proxyasicon);
		  action.click().build().perform();
		  wait.until(ExpectedConditions.visibilityOf((droptext)));
		  wait.until(ExpectedConditions.elementToBeClickable(droptext));
		  droptext.click();
		  wait.until(ExpectedConditions.visibilityOf((droptext)));
		  wait.until(ExpectedConditions.elementToBeClickable(droptext));
		  droptext.sendKeys("17801517");
		  wait.until(ExpectedConditions.visibilityOf((droptext)));
		  wait.until(ExpectedConditions.elementToBeClickable(droptext));
		  selectoption.click();
		  proxybtn.click(); 
		  }
		 
		
			
			  public void clickmenu() {
			  
			  Actions actions = new Actions(driver);
			  wait.until(ExpectedConditions.visibilityOf((menuicon)));
			  wait.until(ExpectedConditions.elementToBeClickable(menuicon));
			  actions.moveToElement(menuicon).click().build().perform();
			  menuicon.click();
			  actions.moveToElement(workflow); actions.click().build().perform();
			  
			  }
			 
		
		//public void clickworkflow()
		//{
			//wait.until(ExpectedConditions.visibilityOf((workflow)));
			//workflow.click();
		//}
	}
