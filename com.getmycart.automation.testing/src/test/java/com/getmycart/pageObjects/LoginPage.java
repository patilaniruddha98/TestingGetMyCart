package com.getmycart.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver) {
		
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(id="email")
	WebElement enterUsername;
	
	@FindBy(id="password")
	WebElement enterPassword;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/main/div/form/div[4]/button")
	WebElement clickOnSignInButton;
	
	
	public void enterUserName(String uname) {
		enterUsername.sendKeys(uname);
	}
	
	public void enterPassword(String pword) {
		enterPassword.sendKeys(pword);
	}
	
	public void clickOnSignInButton() {
		clickOnSignInButton.click();
	}

}
