package com.getmycart.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShippingAddressScreen {
	WebDriver ldriver;
	
	public ShippingAddressScreen(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
		
	}
	
	@FindBy(id="FullName")
	WebElement enterFullName;
	
	@FindBy(id="address")
	WebElement enterAddress;
	
	@FindBy(id="city")
	WebElement enterCity;
	
	@FindBy(id="postalCode")
	WebElement enterPostalCode;
	
	@FindBy(id="country")
	WebElement enterCountry;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/main/div/form/div[7]/button")
	WebElement clickOnContinueButton;
	
	
	public void enterFullName() {
		enterFullName.sendKeys("Aniruddha Patil");
	}
	
   public void enterAddress() {
	   enterAddress.sendKeys("Maharashtra sanpada");
	}
   
   public void enterCity() {
	   enterCity.sendKeys("Mumbai");
	}
   public void enterPostalCode() {
	   enterPostalCode.sendKeys("400705");
	}
   public void enterCountry() {
	   enterCountry.sendKeys("India");
	}
   
   public void clickOnContinueButton(){
	   clickOnContinueButton.click();
   }
}
