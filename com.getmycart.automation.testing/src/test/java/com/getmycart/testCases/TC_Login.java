package com.getmycart.testCases;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.getmycart.pageObjects.HomePage_001;
import com.getmycart.pageObjects.LoginPage;
import com.getmycart.pageObjects.NavigationBar;
import com.getmycart.utilities.XLutils;

public class TC_Login extends BaseClass{

	@Test(dataProvider="LoginData")
	public void loginTest(String user, String pwd) {
		
		// Test case 1
		NavigationBar nb=new NavigationBar(driver);
		nb.clickOnSignIn();
		
		//Test case 2
		LoginPage lp=new LoginPage(driver);
		lp.enterUserName(user);
		lp.enterPassword(pwd);
		lp.clickOnSignInButton();
		
		logger.info("login successful");
	}
	
	
	@DataProvider(name="LoginData")
	String[][] getData() throws Exception{
		String path=System.getProperty("user.dir")+"/src/test/java/com/getmycart/testData/LoginCredentials.xlsx";
		int rownum=XLutils.getRowCount(path, "Sheet1");
		int colcount=XLutils.getCellCount(path, "Sheet1", 1);
		
		String logindata[][]=new String[rownum][colcount];
		
		for(int i=1;i<=rownum;i++) {
			for(int j=0;j<colcount;j++) {
				logindata[i-1][j]=XLutils.getCellData(path, "Sheet1", i, j);
			}
		}
		return logindata;
	}
	
}
