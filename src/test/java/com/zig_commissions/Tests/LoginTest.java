package com.zig_commissions.Tests;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.zig_commissions.Pages.ATTPMultiCTNInquiryPage;
import com.zig_commissions.Pages.HomePage;
import com.zig_commissions.Pages.LoginPage;
import com.zig_commissions.Utilities.Initialize_browser;


public class LoginTest extends Initialize_browser{
	
	LoginPage login;	
	HomePage home;
	ATTPMultiCTNInquiryPage attp;
	
	@Test
	public void login() 
	{
		login = new LoginPage();
		
		home = login.logIn();
		home.profilemenu();
		home.clickmenu();
		attp = home.raiseAttpCommissionsSupport();
		attp.attpmultictnfileUpload();
	}
}
