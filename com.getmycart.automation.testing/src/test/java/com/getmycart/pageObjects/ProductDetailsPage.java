package com.getmycart.pageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ProductDetailsPage {
	WebDriver ldriver;
	public ProductDetailsPage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	
	
	@FindBy(xpath="//h1[contains(text(),'Fit & Flare Dress with Bell Sleves')]")
	WebElement productName;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/main/div/div/div/div[3]/div/ul/li[3]/div/div[2]/select")
	WebElement clickOnQtyDropDown;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/main/div/div/div/div[3]/div/ul/li[4]/button")
	WebElement clickOnAddToCartButton;
	
	
	public String getProductName() {
		return productName.getText();
	}
	
	public void clickOnQtyDropDown() throws InterruptedException {
		Select qty=new Select(clickOnQtyDropDown);
		qty.selectByIndex(2);
		Thread.sleep(3000);
		ldriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	
	public void  clickOnAddToCartButton() {
		 clickOnAddToCartButton.click();
	}
	
	
}
