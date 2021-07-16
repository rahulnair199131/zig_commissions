package com.zig_commissions.Tests;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.zig_commissions.Pages.homePage;
import com.zig_commissions.Pages.loginPage;
import com.zig_commissions.Utilities.Initialize_browser;


public class loginTest extends Initialize_browser{
	
	loginPage login;	
	homePage home;
	
	@Test
	public void login() 
	{
		login = new loginPage();
		home = login.logIn();
		home.profilemenu();
		home.clickmenu();
		home.raiseAttpCommissionsSupport();
	}
}
