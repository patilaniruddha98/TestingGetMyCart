package com.getmycart.pageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage_001 {
	
	WebDriver ldriver;
	
	public HomePage_001(WebDriver rdriver){
		
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//*[@id=\"root\"]/div/main/div/div/div[8]/div/a/h2")
	WebElement clickOnProduct;
	
	
	
	public void clickOnProduct() {
		
		ldriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		  JavascriptExecutor js=(JavascriptExecutor) ldriver;
		  js.executeScript("scroll(0,250)");
		 
		ldriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		clickOnProduct.click();
		
		
	}
	
	

}
