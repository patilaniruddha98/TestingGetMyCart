package com.getmycart.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.getmycart.pageObjects.CartPage;
import com.getmycart.pageObjects.HomePage_001;
import com.getmycart.pageObjects.LoginPage;
import com.getmycart.pageObjects.NavigationBar;
import com.getmycart.pageObjects.OrderScreen;
import com.getmycart.pageObjects.PaymentMethodScreen;
import com.getmycart.pageObjects.ProductDetailsPage;
import com.getmycart.pageObjects.ShippingAddressScreen;

public class TC_BuyProduct_001 extends BaseClass {
	
	@Test
	public void BuyProduct() throws InterruptedException {
		
		//Test step 1
		NavigationBar nb=new NavigationBar(driver);
		nb.clickOnSignIn();
		Thread.sleep(2000);
		
		//Test step 2
		LoginPage lp=new LoginPage(driver);
		lp.enterUserName(uname);
		lp.enterPassword(pword);
		lp.clickOnSignInButton();
		logger.info("login successful");
		Thread.sleep(2000);
		
		//Test Step 3
		HomePage_001 b=new HomePage_001(driver);
		b.clickOnProduct();
		Thread.sleep(2000);
		
		//Test Step 4
		 ProductDetailsPage c=new  ProductDetailsPage(driver);
		 String productName=c.getProductName();
		 if(productName.equals("Fit & Flare Dress with Bell Sleves")) {
			 Assert.assertTrue(true);
			 logger.info("product selected : "+productName);
		 }else {
			 Assert.assertTrue(false);
			 
		 }
		 
		 //Test Step 5
		 
		 c.clickOnQtyDropDown();
		 logger.info("selected quantity 3");
		 Thread.sleep(2000);
			
		 //Test Step 6
		 c.clickOnAddToCartButton();
	     Thread.sleep(4000);
	     
	     
	     
		//Test Step 7
		CartPage d=new CartPage(driver);
		String amount=d.getTotal_001();
		if(amount.equals("Subtotal (3 items) : Rs.2964")) {
			Assert.assertTrue(true);	
			logger.info(amount);
		}else {
			Assert.assertTrue(false);	
			logger.info("amount should be 'Subtotal (3 items) : Rs.2964' but it comes "+amount);
		}
		
		//Test Step 8
		d.clickOnQtyDropDown();
		Thread.sleep(1500);
		String amount1=d.getTotal_001();
		Assert.assertTrue(amount1.contains("6916"), "something is wrong");
		
		//Test Step 9
		NavigationBar e=new NavigationBar(driver);
		String number=e.itemsAddedToCart();
		if(number.equals("1")) {
			Assert.assertTrue(true);	
			logger.info("total items in a cart : "+number);
		}else {
			logger.info("something is wrong");
			Assert.assertTrue(false);	
		}
		
		//Test Step 10
		d.clickOnProceedToCheckOutButton();
		logger.info("Clicked on proceed to check button");
		
		//Test Step 11
		ShippingAddressScreen f=new ShippingAddressScreen(driver);
		f.enterFullName();
		f.enterAddress();
		f.enterCity();
		f.enterPostalCode();
		f.enterCountry();
		f.clickOnContinueButton();
		logger.info("Enter full name, Address, City,Postal code Contry and clicked continue button");
		
		//Test Step 12
		PaymentMethodScreen g=new PaymentMethodScreen(driver);
		g.clickOnContinueButton();
		
		//Test Step 13
		OrderScreen h=new OrderScreen(driver);
		h.ClickOnPlaceOrderButton();
		logger.info("Clicked on placed order button");
	}

}
