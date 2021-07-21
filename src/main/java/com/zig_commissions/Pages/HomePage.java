package com.zig_commissions.Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.zig_commissions.Utilities.Constants;
import com.zig_commissions.Utilities.Initialize_browser;

public class HomePage extends Initialize_browser{
	
	WebDriverWait wait = new WebDriverWait(driver,Constants.waitDuration);
	
	
	public HomePage() {
        
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
		
		@FindBy (xpath = "//img[@title='Profile']")
	    public WebElement profileIcon;
		
		@FindBy (xpath = "//td[text()='Projects']")
	    public WebElement projectLabel;
		
		
		
		@FindBy (id = "newCaseMenuItem")
	    public WebElement plusIcon;
		
		@FindBy (xpath = "//iframe[contains(@ng-src,'/CallidusPortal/')]")
	    public WebElement frame;
		
		@FindBy (id = "new-casedropdown")
	    public WebElement caseDropdown;
		
		@FindBy (xpath = "//a[text()='ATTP Commissions Support']")
	    public List<WebElement> attpcommissionSupportLink;
		
		@FindBy (xpath = "//a[text()='ATTP Multi CTN Inquiry']")
	    public List<WebElement> attpmultiCTNLink;
		
		
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
			  
				 JavascriptExecutor exe = (JavascriptExecutor) driver;
				 Integer noOfFrames = Integer.parseInt(exe.executeScript("return window.length").toString());
			System.out.println("No. of iframes on the menu page are " + noOfFrames);
			  Actions actions = new Actions(driver);
			  wait.until(ExpectedConditions.visibilityOf((menuicon)));
			  wait.until(ExpectedConditions.elementToBeClickable(menuicon));
			  actions.moveToElement(menuicon).click().build().perform();
			  menuicon.click();
			  actions.moveToElement(workflow); actions.click().build().perform();
			  
			  }
			  
			  
			  public ATTPMultiCTNInquiryPage raiseAttpCommissionsSupport()  {
				  
				  JavascriptExecutor exe = (JavascriptExecutor) driver;
				  Integer noOfFrames = Integer.parseInt(exe.executeScript("return window.length").toString());
				  System.out.println("No. of iframes on the workflow page are " + noOfFrames);
				  
				  wait.until(ExpectedConditions.visibilityOf((profileIcon)));
				  
				  wait.until(ExpectedConditions.visibilityOf((frame)));
				  
				  
				  driver.switchTo().frame(frame);
				  
				  
				  wait.until(ExpectedConditions.visibilityOf((plusIcon)));
				  
				  exe.executeScript("arguments[0].click();", plusIcon);
				  
				  wait.until(ExpectedConditions.visibilityOf((caseDropdown)));
				  
				  attpmultiCTNLink.get(0).click();
				  
				  return new ATTPMultiCTNInquiryPage();
				  
			  }
			 
		
		
	}

