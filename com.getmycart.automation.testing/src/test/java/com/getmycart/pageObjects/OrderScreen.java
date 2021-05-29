package com.getmycart.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderScreen {
	
	WebDriver ldriver;
	
	public OrderScreen(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//*[@id=\"root\"]/div/main/div/div[2]/div[2]/div/ul/li[6]/button")
	WebElement ClickOnPlaceOrderButton;
	
	public void ClickOnPlaceOrderButton() {
		ClickOnPlaceOrderButton.click();
	}

}
