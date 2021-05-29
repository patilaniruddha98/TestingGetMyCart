package com.getmycart.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CartPage {
WebDriver ldriver;
	
	public CartPage(WebDriver rdriver){
		
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//*[@id=\"root\"]/div/main/div/div[2]/div/ul/li[1]/h2")
	WebElement getTotal_001;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/main/div/div[1]/ul/li/div/div[3]/select")
	WebElement clickOnQtyDropDown;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/main/div/div[2]/div/ul/li[2]/button")
	WebElement clickOnProceedToCheckOutButton;
	
	
	
	public String getTotal_001() {
		return getTotal_001.getText();
	}
	
	public void clickOnQtyDropDown() {
		Select qty=new Select(clickOnQtyDropDown);
		qty.selectByValue("7");
	}
	
	public void clickOnProceedToCheckOutButton() {
		clickOnProceedToCheckOutButton.click();
	}

}
