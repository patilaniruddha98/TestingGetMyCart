package com.getmycart.testCases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.getmycart.pageObjects.LoginPage;
import com.getmycart.pageObjects.NavigationBar;

public class TC_Logout extends BaseClass {

	
	@Test()
	public void logoutTest() {
		
		NavigationBar nb=new NavigationBar(driver);
		nb.clickOnSignIn();
		
		LoginPage lp=new LoginPage(driver);
		lp.enterUserName(uname);
		lp.enterPassword(pword);
		lp.clickOnSignInButton();
		logger.info("login successful");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		nb.hoverOnUserName();
		nb.clickOnSignOut();
		logger.info("logout sucessful");
	}
	
	
}
