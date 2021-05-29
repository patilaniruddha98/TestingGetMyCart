package com.getmycart.testCases;

import org.testng.annotations.Test;

import com.getmycart.pageObjects.HomePage_001;

public class TC_OpenURL extends BaseClass{
	
	@Test(priority=0)
	public void myPage() {
		
		//Test case 1
		
		HomePage_001 hp=new HomePage_001(driver);
		String a=driver.getCurrentUrl();
		logger.info(a);
		
	}

}
