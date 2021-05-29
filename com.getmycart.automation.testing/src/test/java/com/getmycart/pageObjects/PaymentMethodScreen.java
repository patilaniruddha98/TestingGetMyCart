package com.getmycart.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentMethodScreen {
	
	WebDriver ldriver;
	
	public PaymentMethodScreen(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//button[contains(text(),'Continue')]")
	WebElement clickOnContinueButton;
	
	
	public void clickOnContinueButton() {
		clickOnContinueButton.click();
	}

}
