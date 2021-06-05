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
	
	@FindBy(xpath="//body[1]/div[1]/div[1]/main[1]/div[1]/div[1]/ul[1]/li[1]/div[1]/div[3]/select[1]")
	WebElement clickOnQtyDropDown;
	
	@FindBy(xpath="//button[contains(text(),'Proceed to Checkout')]")
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
