package com.getmycart.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NavigationBar {

	WebDriver ldriver;
	public NavigationBar(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//*[@id=\"root\"]/div/header/div[2]/a[2]")
	WebElement clickedOnSignIn;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/header/div[2]/div[1]/a")
	WebElement hoverOnUserName;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/header/div[2]/div[1]/ul/li[1]/a")
	WebElement clickOnSignOut;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/header/div[2]/a[1]/span")
	WebElement itemsAddedToCart;
	
	
	public void clickOnSignIn() {
		clickedOnSignIn.click();
	}
	
	public void hoverOnUserName() {
		/*
		 * Actions action=new Actions(ldriver); action.moveToElement(hoverOnUserName);
		 */
		hoverOnUserName.click();
	}
	
	public void clickOnSignOut() {
		clickOnSignOut.click();
	}
	
	public String itemsAddedToCart() {
		return itemsAddedToCart.getText();
	}
	
	
	
	
	
}
